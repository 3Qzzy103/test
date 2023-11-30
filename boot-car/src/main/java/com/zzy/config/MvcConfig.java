package com.zzy.config;

import com.zzy.filter.CrossFilter;
import com.zzy.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Value("${img.dir}")
    private String uploadDir;

    @Value("${img.prefix}")
    private String prefix;

    @Autowired
    LoginInterceptor loginInterceptor;

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/code","/user/login","/files/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String mapping = prefix.endsWith("/") ? prefix+"**" : prefix + "/**";
        //file:d:/upload/et2209/
        String locations = uploadDir.endsWith("/")? "file:" + uploadDir : "file:" + uploadDir +"/";

        registry.addResourceHandler(mapping)//  /files/**
            .addResourceLocations(locations);
    }

    /**
     * 注册过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean<CrossFilter> crossFilter(){
        FilterRegistrationBean<CrossFilter> registration = new FilterRegistrationBean<>();
        // filter-class
        registration.setFilter(new CrossFilter());
        // url-parttern
        registration.addUrlPatterns("/*");
        //执行顺序
        registration.setOrder(-100);

        return registration;
    }
}

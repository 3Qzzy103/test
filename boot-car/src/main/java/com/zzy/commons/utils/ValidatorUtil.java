package com.zzy.commons.utils;

import com.zzy.commons.exception.ParamExcetion;
import org.apache.commons.collections4.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 校验工具类
 */
public class ValidatorUtil {
    /** Java Bean 校验器 */
    private static final Validator validator;

    static{
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public static  void validate(Object object){
        Set<ConstraintViolation<Object>> violations = validator.validate(object);
        if(CollectionUtils.isNotEmpty(violations)){
            String msg = violations.stream().map(
                    v -> v.getPropertyPath().toString() + v.getMessage()
            ).collect(Collectors.joining("；"));

            throw new ParamExcetion(msg);
        }
    }
}

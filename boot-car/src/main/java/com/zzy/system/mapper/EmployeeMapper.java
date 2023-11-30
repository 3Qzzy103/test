package com.zzy.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzy.system.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> getList(Employee employee);

    boolean deleteEmp(@Param("idList") List<Long> id);

}

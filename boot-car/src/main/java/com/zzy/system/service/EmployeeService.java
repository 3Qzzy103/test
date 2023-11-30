package com.zzy.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.commons.vo.PageVO;

import com.zzy.system.entity.Employee;

import java.util.List;

public interface EmployeeService extends IService<Employee> {

    PageVO<Employee> getList(int pageNum, int pageSize, Employee employee);

    boolean addEmp(Employee employee);

    boolean updateEmp(int id , Employee employee);

    boolean deleteEmp(List<Long> idList);

}

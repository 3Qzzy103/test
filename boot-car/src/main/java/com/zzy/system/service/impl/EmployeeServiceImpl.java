package com.zzy.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.commons.exception.ParamExcetion;
import com.zzy.commons.vo.PageVO;
import com.zzy.system.entity.Employee;
import com.zzy.system.mapper.EmployeeMapper;
import com.zzy.system.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public PageVO<Employee> getList(int pageNum, int pageSize, Employee employee) {
        PageHelper.startPage(pageNum,pageSize);
        List<Employee> list = employeeMapper.getList(employee);
        PageInfo<Employee> pageInfo = new PageInfo<>(list);

        return new PageVO<>(pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                list,
                pageInfo.getTotal());
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
        public boolean addEmp(Employee employee) {

        return save(employee);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public boolean updateEmp(int id, Employee employee) {
        Employee saveEmp = getById(id);
        if(ObjectUtils.isEmpty(saveEmp)){
            throw new ParamExcetion("未查询到要更新的员工信息!");
        }
        employee.setId(id);
        return updateById(employee);
    }

    @Transactional
    @Override
    public boolean deleteEmp(List<Long> idList) {
        return employeeMapper.deleteEmp(idList);
    }
}

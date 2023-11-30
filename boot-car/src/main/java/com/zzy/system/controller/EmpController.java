
package com.zzy.system.controller;


import com.zzy.commons.vo.PageVO;
import com.zzy.commons.vo.ResultVO;
import com.zzy.system.entity.Employee;
import com.zzy.system.service.EmployeeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    /**
     * 添加接口
     */
    @PostMapping
    public ResultVO addEmp(@RequestBody Employee employee){
        boolean isSuccess = employeeService.addEmp(employee);
        if (!isSuccess){
            return ResultVO.failed("添加失败！");
        }
        return ResultVO.success(StringUtils.EMPTY);
    }

    @GetMapping
    public ResultVO getList(@RequestParam(required = false,defaultValue = "1") int pageNum,
                            @RequestParam(required = false,defaultValue = "5") int pageSize ,
                            Employee employee){
        PageVO<Employee> pageVO = employeeService.getList(pageNum, pageSize, employee);
        return ResultVO.success(pageVO);
    }

    @PutMapping("/{id}")
    public ResultVO updateEmp(@PathVariable("id") int id,Employee employee){
        boolean isSuccess = employeeService.updateEmp(id, employee);
        if (!isSuccess){
            return ResultVO.failed("更新失败！");
        }
        return ResultVO.success(StringUtils.EMPTY);
    }

    @DeleteMapping
    public ResultVO deleteEmp(@RequestBody List<Long> idList){
        boolean isSuccess = employeeService.deleteEmp(idList);
        if (!isSuccess){
            return ResultVO.failed("删除失败！");
        }
        return ResultVO.success(StringUtils.EMPTY);
    }


}


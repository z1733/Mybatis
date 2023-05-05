package com.ztt.mapper;

import com.ztt.pojo.employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpployeesMapper {

    List<employees> getEmpAll();

    employees getEmpAndDept(@Param("employee_id") Integer employee_id);

    employees getEmpAndDeptSearTor(@Param("employee_id") Integer employee_id);

    employees getDeprById(@Param("departments_id") Integer departments_id);
}

package com.ztt.mapper;

import com.ztt.pojo.departments;
import com.ztt.pojo.jobs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentsMapper {

    departments getEmpAndDeptTwe(@Param("department_id") Integer department_id);

    departments getDeptEmpOne(@Param("department_id") Integer department_id);

    departments getDeptEmpOneSartOne(@Param("department_id") Integer department_id);

    List<jobs> deptList(jobs jobs);

    Integer deleteDeptById(@Param("department_id") Integer[] department_id);

    Integer insertDept(@Param("dept") List<departments> dept);

    List<departments> list();
}

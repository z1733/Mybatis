package com.ztt.mapper;

import com.ztt.pojo.employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SqlMapper {

    List<employees> list(@Param("first_name") String first_name);

    int deleteById(@Param("ids") String ids);

    List<employees> getEmpByID(@Param("tableName") String tableName);

    void insertEmp(employees employees);
}

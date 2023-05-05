package com.ztt.mapper;

import com.ztt.pojo.departments;
import com.ztt.pojo.jobs;

import java.util.List;

public interface DynamicSQLMapper {

    List<jobs> deptList(jobs jobs);

    List<jobs> jobs_list(jobs jobs);

}

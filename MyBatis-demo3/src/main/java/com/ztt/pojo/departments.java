package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class departments {
    Integer department_id;
    String department_name;
    Integer manager_id;
    Integer location_id;
    List<employees> employees;

    public departments(Integer department_id, String department_name, Integer manager_id, Integer location_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.manager_id = manager_id;
        this.location_id = location_id;
    }
}

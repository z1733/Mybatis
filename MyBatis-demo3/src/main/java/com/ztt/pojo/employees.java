package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class employees {
    Integer employee_id;
    String first_name;
    String last_name;
    String email;
    String phone_number;
    String job_id;
    double salary;
    double commission_pct;
    Integer manager_id;
    int department_id;
    String hiredate;
    departments departments;
}

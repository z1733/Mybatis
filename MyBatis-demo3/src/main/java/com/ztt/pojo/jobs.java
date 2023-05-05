package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class jobs {
    private String job_id;
    private String job_title;
    private Integer min_salary;
    private Integer max_salary;
}

package com.ztt.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.department_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    private Integer departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.department_name
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    private String departmentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.manager_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    private Integer managerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.location_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    private Integer locationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.column_name
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    private Integer columnName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.department_id
     *
     * @return the value of departments.department_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.department_id
     *
     * @param departmentId the value for departments.department_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.department_name
     *
     * @return the value of departments.department_name
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.department_name
     *
     * @param departmentName the value for departments.department_name
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.manager_id
     *
     * @return the value of departments.manager_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.manager_id
     *
     * @param managerId the value for departments.manager_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.location_id
     *
     * @return the value of departments.location_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.location_id
     *
     * @param locationId the value for departments.location_id
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.column_name
     *
     * @return the value of departments.column_name
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public Integer getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.column_name
     *
     * @param columnName the value for departments.column_name
     *
     * @mbg.generated Mon Feb 20 20:04:39 CST 2023
     */
    public void setColumnName(Integer columnName) {
        this.columnName = columnName;
    }
}
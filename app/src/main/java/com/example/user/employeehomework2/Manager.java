package com.example.user.employeehomework2;

/**
 * Created by user on 20/06/2017.
 */

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName){
        super(empId);
        super(name);
        super(ssn);
        super(salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

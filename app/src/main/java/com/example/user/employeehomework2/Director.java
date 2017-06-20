package com.example.user.employeehomework2;

/**
 * Created by user on 20/06/2017.
 */

public class Director extends Manager{

    private double budget;

    public Director(double budget){
        super(empId);
        super(name);
        super(ssn);
        super(salary);
        super(deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}

package com.example.user.employeehomework2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployee {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee(1, "Eddie", "JG01", 35000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Eddie", employee.getName());
    }

    @Test
    public void checkRaiseSalary(){
        assertEquals(36000.00, employee.raiseSalary(1000.00), 0.01);
    }
}

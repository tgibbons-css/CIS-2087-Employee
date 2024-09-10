package cis.pkg2087.employee;

import java.util.Date;

/**
 * Write a description of class FullTimeEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FullTimeEmployee extends Employee
{
    //private data
    private double salary;
    
    public FullTimeEmployee(String name, Date dob, double salary){
        super(name, dob);
        this.salary = salary;
    }
    
    public void setSalary(double salary) { 
        if(salary > 0)
            this.salary = salary; 
        else
            this.salary = 0;
    }
    public double getSalary() { return this.salary; }
    
    public double pay() {
        return this.salary/52;
    }

}







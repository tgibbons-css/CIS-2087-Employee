package cis.pkg2087.employee;
/**
 * Abstract class Employee - write a description of the class here
 * 
 * @author Jen Rosato
 * @version Spring 2016
 */
import java.util.Date;
public abstract class Employee
{
    // instance variables - replace the example below with your own
    protected String name;
    protected Date dob;
    
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    
    public Date getDOB() { return this.dob; }
    public void setDOB(Date dob) { this.dob = dob; }
    
    public abstract double pay();
}







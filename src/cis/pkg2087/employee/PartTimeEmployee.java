package cis.pkg2087.employee;

import java.util.Date;
/**
 * Write a description of class PartTimeEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartTimeEmployee extends Employee
{
   private double wage;
   private double hours;
   
   public PartTimeEmployee(String name, Date dob, double wage, double hours)
   {
       super(name, dob);
       this.wage = wage;
       this.hours = hours;
    }
    
    public double getWage()
    {
        return this.wage;
    }
    
    public double setWage(double wage)
    {
        return this.wage =wage;
    }
    
    public double getHours()
    {
        return this.hours;
    }
    
    public double setHours(double hours)
    {
        if(hours>0){
            return this.hours = hours;
        }else{
              return this.hours = 0;
        }
    }
    
    public double pay(){
        return wage*hours;
    }
}

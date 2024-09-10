package cis.pkg2087.employee;

import java.util.Date;
/**
 * Write a description of class EmployeeTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
                
        FullTimeEmployee emp1 = new FullTimeEmployee("Jen", new Date(75, 1, 22), 75000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Dave", new Date(75, 1, 22), 15.00, 30.00);
        Employee emp3 = new FullTimeEmployee("Tom", new Date(70, 1, 22), 80000);

        System.out.println("First Employee name is " + emp1.getName());
        System.out.println("   This person should be paid " + emp1.pay());
        System.out.println("Second Employee name is " + emp2.getName());
        System.out.println("   This person should be paid " + emp2.pay());
        System.out.println("Third Employee name is " + emp3.getName());
        System.out.println("   This person should be paid " + emp3.pay());
        
        //ArrayList<Employee>
    }
}

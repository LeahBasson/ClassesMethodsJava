package za.ac.cput;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RunPrac3 {

    public static void main(String[] args) {
        // store 3 employee objects in an arraylist.
        // we are storing Employee objects.
        ArrayList<Employee> employees = new ArrayList<>();
        
        Employee emp1 = new Employee("Erin", "Michell", 5000);
        employees.add(emp1);
        
        Employee emp2 = new Employee("Caitlyn", "Harris", 15000);
        employees.add(emp2);
        
        Employee emp3 = new Employee("Jamin", "Marshall", 7000);
        employees.add(emp3);
        
        int nrEmployees = 3;
        
        // display 3 employee objects.
        for (int i = 0; i < employees.size(); i++){
            JOptionPane.showMessageDialog(null, employees.get(i));
        }
        
        // display only the name and surname of employees who surname starts with the letter m.
        for (int i = 0; i < employees.size(); i++){
            Employee emp = employees.get(i);
            
            if (emp.getSurname().startsWith("M")){
                JOptionPane.showMessageDialog(null, "Employee surname starts with M: \nName: " + emp.getName() + " Surname: " + emp.getSurname());
            }
        }
        
        // remove all employees whose salary is less than / equal to R5000. 
        // Then display all the details of the remaining objects.
        
        for (int i = 0; i < employees.size(); i++){
            Employee emp = employees.get(i);
            
            if (emp.getSalary() <= 5000){
                employees.remove(i);
                JOptionPane.showMessageDialog(null, "Employees left:" + employees.toString());
            }
        }

    }// end of main

}// end of class

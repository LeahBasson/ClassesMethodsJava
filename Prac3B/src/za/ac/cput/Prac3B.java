package za.ac.cput;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Prac3B {

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

        // display 3 employee objects.
        for (int i = 0; i < employees.size(); i++) {
            JOptionPane.showMessageDialog(null, employees.get(i));
        }

        String letter = JOptionPane.showInputDialog("Enter letter: ");
        
        // set to false and will become true if letter is found.
        boolean found = false;
        
        // display only the name and surname of employees who surname starts with the letter entered.
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);

            String surname = emp.getSurname();

            if (surname.startsWith(letter)) {
                JOptionPane.showMessageDialog(null, "Employee: \nName: " + emp.getName() + " Surname: " + emp.getSurname());
                found = true;
            }

        }//end of for loop
        if (found == false) {
            JOptionPane.showMessageDialog(null, "Employee surname does not exist.");
        }

        // remove all employees whose salary is less than / equal to R5000. 
        // Then display all the details of the remaining objects.
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);

            if (emp.getSalary() <= 5000) {
                employees.remove(i);
                JOptionPane.showMessageDialog(null, "Employees left:" + employees.toString());
            }
        }
    }// end of main

}// end of class

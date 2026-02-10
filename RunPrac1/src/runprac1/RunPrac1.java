package runprac1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class RunPrac1 {

    public static void main(String[] args) {
        // employee object using the default constructor.
        // Create the object first, I’ll populate it later.
        Employee emp1 = new Employee();

        // read in values
        Scanner kbd = new Scanner(System.in);

        // Previously:
        // System.out.print("Enter employee 1 name: ");
        // String dEmpName = kbd.next();
        // Now - static method - Classname.methodname
        // default constructor
        String dEmpName = JOptionPane.showInputDialog("Enter employee 1 name: ");
        String dEmpSurname = JOptionPane.showInputDialog(
                "Enter employee 1 surname: ");
        String dEmpNumber = JOptionPane.showInputDialog(
                "Enter employee 1 number: ");
        String dSalInput = JOptionPane.showInputDialog(
                "Enter employee 1 salary: ");
        // Casting for salary
        double dEmpSalary = Double.parseDouble(dSalInput);

        emp1.setEmpName(dEmpName);
        emp1.setEmpSurname(dEmpSurname);
        emp1.setEmpNumber(dEmpNumber);
        emp1.setEmpSalary(dEmpSalary);

        // overloading constructor
        String oEmpName = JOptionPane.showInputDialog("Enter employee 2 name: ");
        String oEmpSurname = JOptionPane.showInputDialog(
                "Enter employee 2 surname: ");
        String oEmpNumber = JOptionPane.showInputDialog(
                "Enter employee 2 number: ");
        String oSalInput = JOptionPane.showInputDialog(
                "Enter employee 2 salary: ");
        // Casting for salary
        double oEmpSalary = Double.parseDouble(oSalInput);

        // Create the object already complete.
        // Requires initialized variables.
        Employee emp2 = new Employee(oEmpName, oEmpSurname, oEmpNumber,
                oEmpSalary);

        // Display employee values
        // System.out.println(emp1);
        // System.out.println(emp2);
        JOptionPane.showMessageDialog(null, "Employee1{" + "empName=" + emp1.
                getEmpName() + ", empSurname=" + emp1.getEmpSurname() + ", empNumber=" + emp1.
                getEmpNumber() + emp1.getEmpNumber() + ", empSalary=" + emp1.
                getEmpSalary());
        JOptionPane.showMessageDialog(null, "Employee2{" + "empName=" + emp2.
                getEmpName() + ", empSurname=" + emp2.getEmpSurname() + ", empNumber=" + emp2.
                getEmpNumber() + emp2.getEmpNumber() + ", empSalary=" + emp2.
                getEmpSalary());

        // Increase salary
        // System.out.print("Enter increase: ");
        String incrInput = JOptionPane.showInputDialog("Enter salary input: ");
        double increase = Double.parseDouble(incrInput);

        emp1.increaseSalary(increase);
        emp2.increaseSalary(increase);
        // System.out.println("Employee 1 salary increase: " + emp1.getEmpSalary());

        // Display employee increase
        JOptionPane.showMessageDialog(null,
                "Employee 1 salary increase: " + emp1.getEmpSalary());
        JOptionPane.showMessageDialog(null,
                "Employee 2 salary increase: " + emp2.getEmpSalary());

    }//end of main

}// end of class

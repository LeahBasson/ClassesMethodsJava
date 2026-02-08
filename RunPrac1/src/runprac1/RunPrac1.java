package runprac1;

import java.util.Scanner;

public class RunPrac1 {

    public static void main(String[] args) {
        // employee object using the default constructor.
        // Create the object first, I’ll populate it later.
        Employee emp1 = new Employee();

        // read in values
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter employee 1 name: ");
        String dEmpName = kbd.next();

        System.out.print("Enter employee 1 surname: ");
        String dEmpSurname = kbd.next();

        System.out.print("Enter employee 1 number: ");
        String dEmpNumber = kbd.next();

        System.out.print("Enter employee 1 salary: ");
        double dEmpSalary = kbd.nextDouble();
        
        emp1.setEmpName(dEmpName);
        emp1.setEmpSurname(dEmpSurname);
        emp1.setEmpNumber(dEmpNumber);
        emp1.setEmpSalary(dEmpSalary);
        
        System.out.print("Enter employee 2 name: ");
        String oEmpName = kbd.next();

        System.out.print("Enter employee 2 surname: ");
        String oEmpSurname = kbd.next();

        System.out.print("Enter employee 2 number: ");
        String oEmpNumber = kbd.next();
        
        System.out.print("Enter employee 2 salary: ");
        double oEmpSalary = kbd.nextDouble();
        
        // Create the object already complete.
        // Requires initialized variables.
        Employee emp2 = new Employee(oEmpName,oEmpSurname,oEmpNumber,oEmpSalary);
        
        // Display employee values
        System.out.println(emp1);
        System.out.println(emp2);
        
        // Increase salary
        System.out.println("Enter increase: ");
        double increase = kbd.nextDouble();
        
        emp1.increaseSalary(increase);
        System.out.println("Employee 1 salary increase: " + emp1.getEmpSalary());
        
        emp2.increaseSalary(increase);
        System.out.println("Employee 2 salary increase: " + emp2.getEmpSalary());
   

    }//end of main

}// end of class

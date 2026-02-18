
package za.ac.cput;


public class Employee {
    // attributes
    private String name;
    private String surname;
    private double salary;
    
    // constructor
    public Employee(String name, String surname, double salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    
    // getter and setter method
    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setEmpNr(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + '}';
    }
}// end of class

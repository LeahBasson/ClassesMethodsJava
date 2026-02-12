package runprac1;

public class Employee {

    //attributes
    private String empName;
    private String empSurname;
    private String empNumber;
    private double empSalary;

    //constructors
    Employee() {
    }

    Employee(String n, String sn, String num, double sal) {
        this.empName = n;
        this.empSurname = sn;
        this.empNumber = num;
        this.empSalary = sal;
    }

    //setters and getters
    public void setEmpName(String nm) {
        this.empName = nm;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpSurname(String snm) {
        this.empSurname = snm;
    }

    public String getEmpSurname() {
        return this.empSurname;
    }

    public void setEmpNumber(String num) {
        this.empNumber = num;
    }

    public String getEmpNumber() {
        return this.empNumber;
    }

    public void setEmpSalary(double sal) {
        this.empSalary = sal;
    }

    public double getEmpSalary() {
        return this.empSalary;
    }

    public void increaseSalary(double amt) {
        double pct = empSalary * (amt/100);
        empSalary = empSalary + pct;
    }

    @Override
    public String toString() {
        return "Employee{" + "empName=" + empName + ", empSurname=" + empSurname + ", empNumber=" + empNumber + ", empSalary= " + empSalary + '}';
    }

    
}

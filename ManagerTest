
package mypackage;
public class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    protected void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

import mypackage.Employee;
import java.util.Scanner;

class Manager extends Employee {
    private String dept;
    public Manager(String name, double salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }
    public void show() {
        display();
        System.out.println("Dept: " + dept);
    }
}

public class ManagerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        Manager m = new Manager(name, sal, dept);
        m.show();
    }
}

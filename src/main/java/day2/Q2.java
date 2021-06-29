package day2;

import java.util.Scanner;

/*
*
*  Q2 -> create an array of Employee class and find the person who has the maximum salary; print the name of the person who has the highest salary;
*  HINT:
*  Array of Employee Class;
*  Variable of class Employee to find the maximum;
* */
public class Q2 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the employee details");
        for (int i = 0; i < employees.length; i++) {
            Employee employee = new Employee();
            System.out.println("name:");
            employee.name = in.nextLine(); // nextLine -> take entire line input : "RAJ\n"
            System.out.println("id:");
            employee.id = in.nextInt(); // nextInt -> "123\n"
            in.nextLine(); // nextLine -> "\n"
            System.out.println("lname:");
            employee.lname = in.nextLine(); // nextLine -> "DHANANI\n"
            System.out.println("salary:");
            employee.salary = in.nextInt();
            in.nextLine();
            employees[i] = employee; // assign the value to employees array
        }

        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if(employees[i].salary > max.salary) {
                max = employees[i];
            }
        }

        System.out.println(max);

    }
}
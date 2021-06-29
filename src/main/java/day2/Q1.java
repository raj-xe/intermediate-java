package day2;

import java.util.Scanner;

/*
Q1: create custom class employee -> id  int, name String, lname String, salary, int : take input from user create object of class employee and print it.
* */
public class Q1 {
    public static void main(String[] args) {
//        Student s1 = new Student(); // class -> data type and variables of classes are called objects
//        s1.lastname = "Dhanani";
//        s1.name = "Raj";
//        s1.roll_number = 1;
//        s1.score = 90;
//        System.out.println(s1.name);
//        Q1:
        Scanner in = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter details:");
        System.out.println("name:");
        employee.name = in.nextLine(); // nextLine -> take entire line input : "RAJ\n"
        System.out.println("id:");
        employee.id = in.nextInt(); // nextInt -> "123\n"
        in.nextLine(); // nextLine -> "\n"
        System.out.println("lname:");
        employee.lname = in.nextLine(); // nextLine -> "DHANANI\n"
        System.out.println("salary:");
        employee.salary = in.nextInt();
        System.out.println(employee);
    }
}

class Employee {
    int id;
    String name;
    String lname;
    int salary;

    public String toString(){
        return "{id:" +id+
                ",name:"+name+
                ",lname:"+lname+
                ",salary:"+salary+
                "}";
    }
}

class Student {
//    roll_numbers
//    scores
//    name
//    lastname
    int roll_number;
    int score;
    String name;
    String lastname;
}
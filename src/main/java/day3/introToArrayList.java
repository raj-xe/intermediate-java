package day3;

import java.util.ArrayList;

public class introToArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        System.out.println(students.getClass());
        students.add("Raj");
        System.out.println(students);
    }
}

package day2;

/*
*
*  Q2 -> create an array of Employee class and find the person who has the maximum salary; print the name of the person who has the highest salary;
*  HINT:
*  Array of Employee Class;
*  Variable of class Employee to find the maximum;
* */
public class Q2 {
    public static void main(String[] args) {

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
}
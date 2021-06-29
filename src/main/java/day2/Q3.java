package day2;

import java.util.Scanner;

/*
*  take a string as an input - store it in a variable
*  input: dhanani
*  d
*  dh
*  dha
*  dhan
*  dhana
*  dhanan
*  dhanani
*  Hint:
*   you will use 2 for loops - nested ones if you are using charAt else use 1 for loop
*   you will use length()
*   you will use substring()
* */
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner in = new Scanner(System.in); // to take the input from the user
        String str = in.nextLine(); // we are taking input from the user
        for (int i = 1; i <= str.length(); i++) { // iterating a for loop from 1 to the length of the string
            // 1, 2, 3 ... length()
            // substring(start, end) -> string from start to end-1
            System.out.println(str.substring(0,i));
        }
    }
}


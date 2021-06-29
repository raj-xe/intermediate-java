package day2;

import java.util.Scanner;

/*
* Q4:
* Take a string as input from the user
* check if it is a palindrome string or not?
* ex:
*   rar <-> rar (reverse ) = true
*   raj <-> jar (reverse ) = false
* */
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean isPlaindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() - i -1)) {
                isPlaindrome = false;
                break;
            }
        }
        System.out.println(isPlaindrome);
    }
}

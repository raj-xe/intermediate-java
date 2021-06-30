package day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
/*
* Q2:
* take numbers as input from the user, store in the arraylist and sort it
* give me the maximum number and the minimum number
* */
public class Q2 {
    public static void main(String[] args) {
        ArrayList list =  new ArrayList();
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Enter number:");
            float n = in.nextFloat();
            if(n == -1){
                break;
            }
            list.add(n);
        }

        Collections.sort(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}

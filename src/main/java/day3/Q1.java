package day3;

import java.util.ArrayList;
import java.util.Scanner;

/*
*
*  Q1: crate an object of array list and ask for numbers (float) then store it in the
*   the arraylist object and then try to find the maximum of that list.
*  - type casting
*
*  stop taking input when the enter -1
* input:
* 1
* 2
* 10
* 12
* -1
*
* output:
* 12
*
* Wrapper classes
* */
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list =  new ArrayList();
        while(true){
            System.out.println("Enter number:");
            float n = in.nextFloat();
            if(n == -1){
                break;
            }
            list.add(n);
        }
        float max = (float) list.get(0);
//        for (int i = 0; i < list.size(); i++) {
//            if(max < (float) list.get(i)){
//                max = (float) list.get(i);
//            }
//        }
        for(Object num: list.toArray()){ // normal for each loop
            Float n = (Float) num;
            if(max < n) {
                max = n;
            }
        }
        System.out.println("Max:"+max);
    }
}

package day1;


// Q7 create a 2D array, take input from the user and store all the numbers in the array and then print it.
// hint: u need to use 2 for loops - nested ones

import java.util.Arrays;
import java.util.Scanner;
//{
//        {
//         (0,0), (0,1), (0,2), (0,3)
//        },
//        {
//        (1,0), (1,1)...
//        }
//        ...
//}
public class multidim {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        /*
        *   explore each and every floor: f -> 0 to 2
        *       for f, we will visit each and every room: r -> 0 to 3
        *           f,r
        * */

//        for (int i = 0; i <= 2; i++) {
//            for (int j = 0; j <= 3; j++) {
//                System.out.print(i+","+j+" ");
//            }
//            System.out.print("\n");
//        }


        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) { // row
            for (int j = 0; j < 4; j++) { // column
                System.out.println("enter a number for location:"+i+","+j);
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

/*

{
    1, <- 0
    2, <- 1
    4  <- 2
}

* */

/*
* {
*   {1,2,3,4}, <- 0
*   {5,6,7,8}, <- 1
*   ...
* }
*
*
* */
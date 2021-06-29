package day1;

// Q1 print all the numbers that are on the odd indices

// Q2 print all the numbers that are odd

// Q3 create a new array of size 5 and take user's input and store in the array at the respective indices and then in the end do summation of
// all the numbers in array and print it in the console.

// Q4 calculate the mean (average) of the numbers that you stored in the array in Q3.

// Q5 create an array, take size of the array from user as well,
// add the numbers what user enters and then ask a number from the user and then output true if it is present in the array and false if not present
// 4 <- let's say user gives 4 as input.
// an array of size 4;
// then ask 4 numbers to store in the array -> that is create a for loop for that
// you need to ask once more from the user to enter a number to be searched
// and you will try to check each and every element in the array if that is present or not - if yes then print true or else print false.

// Q6 create an array, take inputs from user and find the maximum number in the array.

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a = new int[]{1,21,3,4,5};
        /*
        * 1 -> 0
        * 21 -> 1
        * 3 -> 2
        * 4 3
        * 5 4
        * */
// Q1:
// solution 1
        System.out.println("Q1: Soln 1");
        for (int i = 0; i < 5; i++){
            if(i % 2 != 0) { // even
                System.out.println(a[i]);
            }
        }
//        0,1,2,3,4...
//        1,3,5....

// solution 2
        System.out.println("Q1: Soln 2");
        for (int i = 1; i < 5; i++){
            System.out.println(a[i]);
        }
// Q2:
// solution 1
        System.out.println("Q2: Soln");
        for (int i = 0; i < 5; i++) {
            if(a[i] % 2 != 0) { // odd numbers
                System.out.println(a[i]);
            }
        }
// Q3
// solution 1
//        int[] arr = new int[5]; // we create a arr variable and we initialize the array
//        for (int i = 0; i < 5; i++) { // iterating over the array
//            System.out.println("enter number "+i+":");
//            arr[i] = in.nextInt(); // integer input from the user
//        }
//
//        int sum = 0; // creating a var and init. 0 - that is the baseline
//        for (int i = 0; i < 5; i++) {
//            sum = sum + arr[i]; // adding each and every number present in the array to the sum variable
//        }
//        System.out.println("total:" + sum);
// Q4
// solution 1
//        int[] arr2 = new int[5]; // we create a arr variable and we initialize the array
//        for (int i = 0; i < 5; i++) { // iterating over the array
//            System.out.println("enter number "+i+":");
//            arr2[i] = in.nextInt(); // integer input from the user
//        }
//
//        int sum2 = 0; // creating a var and init. 0 - that is the baseline
//            for (int i = 0; i < 5; i++) {
//            sum2 = sum2 + arr2[i]; // adding each and every number present in the array to the sum variable
//        }
//        System.out.println("mean:" + (float)sum2/arr2.length);
// Q5
        System.out.println("Enter the length of the array");
        int len = in.nextInt();
        int[] arr3 = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("enter the number for index " + i);
            arr3[i] = in.nextInt();
        }
        System.out.println("Enter a number that is to be searched in the array:");
        int number = in.nextInt();
        boolean isPresent = false;
        for (int i = 0; i < len; i++) {
            if(arr3[i] == number) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);
    }
}

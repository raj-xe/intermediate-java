package day4;

// Q1: Fn = Fn-1 + n
// F1 = 1
// Make a recursive function to solve the above given recurrence relation
public class Factorial {

    static int Fun(int n){
        if(n == 1) {
            return 1;
        }
        return Fun(n-1) + n;
    }

    static int FunItr(int n) {
        int r = 1;
        for (int i = 1; i < n; i++) {
            r = r * i;
        }
        return r;
    }

    static int factorial(int n) { // a recursive method

        //Base Cases
        if(n == 0) {
            return 1;
        }

        // decomposition of the problem
        int subSolution =  factorial(n-1);

        // composition - merge the smaller solutions to solve the actual problem
        int result = n * subSolution;

        return result;
    }

    public static void main(String[] args) {
        int output = factorial(4);
        System.out.println(output);
        System.out.println(Fun(4));
    }

}
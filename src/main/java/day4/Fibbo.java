package day4;

/*
* Q2:
* Fibonacci numbers using recursion
* F(n) -> current number
* F(n-1) -> previous number
* F(n-2) -> previous to previous number
*
* Base Case:
* F0 = 1
* F1 = 1
*
* Recurrence Relation:
* F(n) = F(n-1) + F(n-2)
*
* */
public class Fibbo {
    static int fun(int n) {
        // Step 3;
        if(n == 1 || n == 0) {
            return 1;
        }

        // Step 1:
        int result1 = fun(n-1);
        int result2 = fun(n-2);

        // Step 2:
        int merged_solution = result1 + result2;

        return merged_solution;

    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fun(i));
        }
    }
}

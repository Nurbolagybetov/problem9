package assignment1;

import java.util.Scanner;

public class NinethProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Time taken " + duration + " milliseconds");
        int f = factorialN(n);
        int a = factorialK(k);
        int h = n-k;
        int s = factorialH(h);
        System.out.println(f/(a*s));
    }
    /*
     *This method returns factorial of the number that we inputed.
     *Time complexity: 0(n), where n is number that we input.
     *Complexity class: Linear
     *@param n The is number that we input.
     *@return factorial by using recursion
     */
    public static int factorialN(int n){
        if(n<=1){
            return 1;
        }
        return factorialN(n - 1) * n;
    }
    /*
     *This method returns factorial of the number that we inputed.
     *Time complexity: 0(n), where n is the value of the input integer a.
     *Complexity class: Linear
     *@param a The is number that we input.
     *@return factorial by using recursion
     */
    public static int factorialK(int a){
        if(a<=1){
            return 1;
        }
        return factorialK(a - 1) * a;
    }
    /*
     *This method returns factorial of the number that we inputed.
     *Time complexity: 0(n), where n is the value of the input integer h.
     *Complexity class: Linear
     *@param h The is number that we input.
     *@return factorial by using recursion
     */
    public static int factorialH(int h){
        if(h<=1){
            return 1;
        }
        return factorialH(h - 1) * h;
    }
}

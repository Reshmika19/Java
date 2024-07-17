package Recursion;

import java.util.Scanner;

public class nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        //1 to n
        //printN(1,n);

        //n to 1
        //printN(n,n);

        //backtracking 1 to n
        //printN(n,n);

        //backtracking n to 1
        printN(1,n);
    }
    static void printN(int i , int n){
        //1 to n
//        if(i>n){
//            return;
//        }
//        System.out.println(i);
//        printN(i+1,n);

        //n to 1
//        if(i<1){
//            return;
//        }
//        System.out.println(i);
//        printN(i-1,n);

        //backtraing 1 to n
//        if(i<1) return;
//        printN(i-1,n);
//        System.out.println(i);

        //backtracking n to 1
        if(i>n) return;
        printN(i+1 ,n);
        System.out.println(i);
    }
}

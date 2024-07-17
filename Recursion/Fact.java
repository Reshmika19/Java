package Recursion;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        //functional
        int res = factorial(n);
        System.out.println("THE FACTORIAL OF "+n + " IS ");
        System.out.print(res);
    }

    private static int factorial(int n) {
        if(n==0){
           return 1;
      }
        return n*factorial(n-1);




    }
}

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class pascalTree {
    public static void main(String[] args) {
        //pascal tree
        /*List<List<Integer>> pascal = new ArrayList<>();
        int n = 5;
        for(int i = 0 ; i<n ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j<=i ; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    List<Integer> pr = pascal.get(i-1);

                    row.add(pr.get(j)+pr.get(j-1));
                }
            }
            pascal.add(row);
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++)
                System.out.print(pascal.get(i).get(j));
            System.out.println();
        }*/
        long res = 1;
        int n = 7  ;
        System.out.print(res + " ");
        for(int i = 1; i < n ;i++){
            res = res * (n-i);
            res = res / i;
            System.out.print(res + " ");
        }
    }
}


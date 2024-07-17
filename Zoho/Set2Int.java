package Zoho;

import java.util.*;

public class Set2Int {
    public static void main(String[] args) {
        int[] n = {123 , 1, 234, 223};
        Set<Integer> set = new HashSet<>();
        for(int i : n){
            set.add(i);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for(Integer j : set){
            arr[i] = j;
            i++;
        }

        for(int a : arr){
            System.out.println(a);
        }
    }
}

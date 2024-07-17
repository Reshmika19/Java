package Hash;

import java.util.*;
import java.util.Scanner;
import java.util.Set;

public class MaxMin {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i : arr){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {5 , 10 , 5, 15 , 10};
        int n = arr.length;

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i] , map.get(arr[i])+1);
            else
                map.put(arr[i] , 1);
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        int maxE , minE;
        maxE = minE = 0;
        Set<Map.Entry<Integer , Integer> > hmap = map.entrySet();
        for(Map.Entry<Integer,Integer> data : hmap){
                int val = data.getValue();
                if(val > max)
                {
                    maxE = data.getKey();
                    val = max;
                }
                if(val<min) {
                    minE = data.getKey();
                    min = val;
                }
            System.out.println(data.getValue());
        }

        System.out.println("Maximum : " + maxE + "\nMin : " + minE);
    }
}

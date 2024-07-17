package StringsProb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMap {
    public static void main(String[] args) {
        String s = "reshshmikaa";

        char[] c = s.toCharArray();

        int size = c.length;

        Map<Character , Integer> map = new HashMap<>();

        int i = 0;
        while(i!=size){
            if(map.containsKey(c[i]) == false)
                map.put(c[i],1);
            else{
                int old = map.get(c[i]);
                int newV = old + 1;
                map.put(c[i] , old + 1);
            }
            i++;

        }

        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
        for(Map.Entry<Character,Integer> data : hmap){
            System.out.print(data.getKey());
            System.out.print(" : ");
            System.out.print(data.getValue());
            System.out.println();
        }


    }
}

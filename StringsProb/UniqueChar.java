package StringsProb;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        String s = "reshmika";
        char[] c = s.toCharArray();
        int size = c.length;

        Map<Character , Integer> map = new HashMap<>();
        int i = 0;
        while(i!=size){
            if(map.containsKey(c[i]) == false){
                map.put(c[i] , 1);
            }else{
                int oldv = map.get(c[i]);
                int newv = oldv + 1;
                map.put(c[i] , newv);
            }
            i++;
        }

        Set<Map.Entry<Character , Integer>> hmap = map.entrySet();
        for(Map.Entry<Character , Integer> data : hmap)
        {
            if(data.getValue() > 1)
            {
                System.out.println("The given String not Unique Characters");
                System.exit(0);
            }
        }
        System.out.println("The Given String contains UNIQUE Characters");
    }
}

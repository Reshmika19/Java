package StringsProb;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "rrreeesshhmiiikkaka";
        char[] c = s.toCharArray();
        int size = c.length;
        String res = "";

        Map<Character , Integer> map = new LinkedHashMap<>();
        int i = 0;
        while(i!=size){
            if(!map.containsKey(c[i])){
                map.put(c[i] , 1);
            }else{
                int oldv = map.get(c[i]);
                int newv = oldv + 1;
                map.put(c[i] , newv);
            }
            i++;
        }

        Set<Map.Entry<Character , Integer>> lmap = map.entrySet();
        for(Map.Entry<Character, Integer> data : lmap){
            res = res + data.getKey();
        }

        System.out.println("The String is " + res);
    }
}

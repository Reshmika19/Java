package StringsProb;

import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
        String s1 = "camputer";
        String s2 = "cat";
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//
//        Map<Character , Integer> map = new LinkedHashMap<>();
//        for(int i = 0 ; i<c1.length ; i++){
//             map.put(c1[i] , map.getOrDefault(c1[i] , 0)+1);
//        }
//        for(int i = 0 ; i<c2.length ; i++){
//            map.put(c2[i] , map.getOrDefault(c2[i] , 0) + 1);
//        }
//
//        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
//        for(Map.Entry<Character,Integer> data : hmap) {
//            if(data.getValue() == 1){
//                System.out.print(data.getKey() + "");
//            }
//        }

        Set<Character> set = new HashSet<>();
        for(char c : s2.toCharArray()){
            set.add(c);
        }

        StringBuilder str = new StringBuilder();
        for(char c : s1.toCharArray()){
            if(!set.contains(c)){
                str.append(c);
            }
        }

        System.out.println(str.toString());
    }
}

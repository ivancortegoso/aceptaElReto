package DataStructuresUdemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class AnagramHashTable {

    public static List<List<String>> groupAnagrams(String[] array) {
        List<List<String>> res = new ArrayList<>();
        for (String s : array) {
            boolean found = false;
            for (List<String> list : res) {
                String temp = list.get(0);
                if (temp.length() == s.length()) {
                    HashMap<Character, Integer> tempMap = new HashMap<>();
                    for (int i = 0; i < temp.length(); i++) {
                        Character characterTemp = temp.charAt(i);
                        Integer timesRep = tempMap.put(characterTemp, 1);
                        if (timesRep != null ) tempMap.put(characterTemp, timesRep + 1);
                    }
                    int i = 0;
                    for (; i < s.length(); i++) {
                        Character tempC = s.charAt(i);
                        Integer isAlready = tempMap.put(tempC, 0);
                        if (isAlready == null || isAlready == 0) {
                            break;
                        } else if (isAlready > 1) {
                            tempMap.put(tempC, isAlready - 1);
                        }
                    }
                    if (i == s.length()) {
                        list.add(s);
                        found = true;
                    }
                }
            }
            if (!found) {
                res.add(new ArrayList<>( Arrays. asList(s)));
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

}

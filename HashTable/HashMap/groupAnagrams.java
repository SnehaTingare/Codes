package HashTable.HashMap;

import java.util.*;

public class groupAnagrams {

    public static List<List<String>> groupanagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupanagrams(strs);

        System.out.println(result);
    }
}
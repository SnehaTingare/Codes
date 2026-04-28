package Strings;

public class validAnagram {

    public static Boolean validanagram(String s,String t ){

        if(s.length()!=t.length()) return false;
        
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s="car";
         String t="car";

         Boolean res= validanagram(s,t);
         System.out.println(res);
    }
}

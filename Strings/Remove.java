package Strings;

public class Remove {

   public static char removechar(String s, String t){
     int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<t.length();i++){
            if(freq[t.charAt(i)-'a']==0){
                return t.charAt(i);
            }

            freq[t.charAt(i)-'a']--;

        }
        return ' ';
   }

    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";

        char res = removechar(s,t);

        System.out.println("Extra character is: "+ res);
    }
}

// longest subarray with equal freq of 0,1,2
package HashTable.HashMap;

import java.util.HashMap;

public class zeroonetwo {

 public static int longestsubarray(int[] arr){
    HashMap<String,Integer> map = new HashMap<>();
    map.put("0#0",-1);
    int cnt=0,cnt1=0,cnt2=0;
    int maxlen =0 ;

    for(int i=0;i<arr.length;i++){
        int num= arr[i];
        if(num==0){
            cnt++;
        }else if(num==1){
            cnt1++;
        }else if (num==2){
            cnt2++;
        }

        int d10 = cnt1-cnt;
        int d21 = cnt2 - cnt1;

String code =d10 + "#" + d21;
if(map.containsKey(code)){
    int len=i-map.get(code);
    maxlen = Math.max(maxlen,len);
} else{
    map.put(code,i);
}
    }

    return maxlen;
 }

    public static void main(String[] args) {
        int[] arr =new int[]{1,1,2,0,1,0,1,2,1,2,2,0,1};
    int res = longestsubarray(arr);

    
        System.out.print( res );
    }
}

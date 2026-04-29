package HashTable.HashMap;

import java.util.HashMap;

public class divisible {

    public static boolean arraypairs(int arr[],int k){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=arr[i]%k;
            map.put(rem,map.getOrDefault(rem, 0)+1);     
        }

        for(int rem :map.keySet()){
            if(rem==0){
                continue;
            }
            int comprem =k-rem;

            if(map.containsKey(comprem)==false){
                return false;
            }else if(map.get(comprem)!=map.get(rem)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};
        int k=5;
        boolean res= arraypairs(arr,k);
        System.out.println(res);
    }
}

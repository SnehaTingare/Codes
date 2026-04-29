package HashTable.HashMap;

import java.util.HashMap;

public class countPairs {

    public static int countpairs(int arr[],int k ){
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int ele: arr){
            
               map.put(ele,map.getOrDefault(ele,0)+1);
            }
            int pairs=0;

            for(int ele: map.keySet()){
                int rem1=ele-k;
                

                if(map.containsKey(rem1)) pairs+=(map.get(ele)*map.get(rem1));
                
            }
        return pairs/2;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,4,4,4,-2,-2};
        int k=3;

        int res= countpairs(arr,k);

        System.out.println(res);
    }
}

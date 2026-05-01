package HashTable.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class findduplicates {

    public static ArrayList<Integer>  duplicate (int[] nums){
       HashMap<Integer,Integer> map =new HashMap<>();
       ArrayList<Integer> res = new ArrayList<>();

       for(int ele :nums){
        map.put(ele,map.getOrDefault(ele,0)+1);
       }

       for(int key : map.keySet()){
        if(map.get(key)==2){
            res.add(key);
        }
       }

       return res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,1,2,4,1,5,5,7};
 
        ArrayList<Integer> result = duplicate(arr);

        for(int ele:result){
            System.err.print(ele+" ");
        }


    }
}

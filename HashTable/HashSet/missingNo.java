package HashTable.HashSet;

import java.util.HashSet;
import java.util.ArrayList;

public class missingNo {

   public static ArrayList<Integer> missing (int arr[],int l,int h){
    ArrayList<Integer> ans = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();

    for(int ele:arr){
        set.add(ele);
    }

    for(int i=l;i<=h;i++){
        if(!set.contains(i)){
            ans.add(i);
        }
    }
    return ans;
   }

    public static void main(String[] args) {
        int[] arr = new int[]{10,12,11,15};
        int low=10,high=15;
        
        ArrayList<Integer> res = missing(arr,low,high);

        for(int ele:res){
            System.out.print(ele+ " ");
        }
    }
}

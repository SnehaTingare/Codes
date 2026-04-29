package HashTable.HashSet;

import java.util.HashSet;

public class twoSum {

    public static boolean TWOSUM( int arr[],int tar){
    HashSet<Integer> set =new HashSet<>();
    for(int ele : arr){
        int rem=tar - ele;
        if(set.contains(rem)) return true;
        set.add(ele);
    }
        return false;
    }
    public static void main(String[] args) {
        int target = -2;
        int[] arr = new int[]{0,-1,2,-3,1};

        boolean res = TWOSUM(arr,target);
        System.out.println(res);
    }
}

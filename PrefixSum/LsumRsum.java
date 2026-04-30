package PrefixSum;
/* 
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
*/


public class LsumRsum {

    public static int[] lsumrsum(int[] nums){
        int totalsum=0,lsum=0,rsum=0;
        int n=nums.length;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }

        for(int i=0;i<n;i++){
            rsum=totalsum-lsum-nums[i];
            arr[i]+=Math.abs(lsum-rsum);

            lsum+=nums[i];
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{10,4,8,3};
    
        int[] res= lsumrsum(nums);
    for(int i=0;i<res.length;i++){
        System.out.println(res[i]+" ");
    }
    }
}

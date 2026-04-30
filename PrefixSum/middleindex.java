package PrefixSum;
/* 
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4
*/

public class middleindex {

    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;

        int n = nums.length;

        
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

    
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;   // leftmost index
            }

            leftSum += nums[i];
        }

        return -1;
    }
     public static void main(String[] args) {
        int[] nums = new int[]{2, 3, -1, 8, 4};

        int res = findMiddleIndex(nums);

        System.out.println("Middle Index: " + res);
    }
}

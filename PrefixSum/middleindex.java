package PrefixSum;

public class middleindex {

    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;

        int n = nums.length;

        // Step 1: calculate total sum
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        // Step 2: find middle index
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

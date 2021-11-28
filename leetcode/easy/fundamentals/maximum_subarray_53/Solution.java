/*
 TC: O(N)
 SC: O(1)

Whenever you see a question that asks for the maximum or minimum of something, consider Dynamic Programming as a possibility.

But since we only care about sum, we can just a variable and no extra storage for
memoization, this is the Kadane's algo
*/

class Solution {
    
    // Kadane's algorithm
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        
        int tempSum = nums[0];
        int maxSum = nums[0];
        
        for (int i=1; i<nums.length; i++) {
            tempSum = Math.max(tempSum + nums[i], nums[i]);
            maxSum = Math.max(tempSum, maxSum);
        }
        return maxSum;
    }
}

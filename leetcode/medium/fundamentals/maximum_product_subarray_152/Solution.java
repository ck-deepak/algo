/*

    TC: O(N)
    SC: O(1)
    
    Variation to Kadane's algorithm
*/

class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        
        for (int i=1; i<nums.length; i++) {
            // a negative number is tricky because if you encounter it once, your product chain is lost, but encounter it twice and its saved
            
            // so you have to keep previous max and mins as the min (from a negative number) can become the max if current num is negative and vice versa for max.
            int tempMin = Math.min(min * nums[i], max * nums[i]);
            int tempMax = Math.max(max * nums[i], min * nums[i]);
            
            min = Math.min(tempMin, nums[i]);
            max = Math.max(tempMax, nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}

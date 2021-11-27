/*
 Time complexity: O(N log N)
 Space complexity: O(1)
 
 Commented code does it in TC:O(N) and SC:O(N) with HashSet
*/


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        
        return false;
    }
    
    // public boolean containsDuplicate(int[] nums) {
    //     Set<Integer> set = new HashSet<>(nums.length);
    //     for (int x: nums) {
    //         if (set.contains(x)) return true;
    //         set.add(x);
    //     }
    //     return false;
    // }
}

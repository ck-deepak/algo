/*
    TC: O(logN) 2 pass
    SC: O(1)
    
    This leverages the find minimum in sorted rotated array solution and then
    decides which side to conduct a normal Binary Search on

*/

class Solution1 {
    public int search(int[] nums, int target) {
        
        int left=0,right=nums.length-1;
        // inflextion point
        int i = -1;
        
        // necessary as if only 1, left,right pointers will cause errors
        if (nums.length==1) {
            return nums[0]==target?0:-1;
        }
        
        while(left<right) {
            int mid = (left+right)/2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        i = left;
        // base case, target on LHS        
        left = 0;
        right = i;
        
        if (target==nums[i])
            return i;
        if (i==0) {
            left = 0;
            right = nums.length-1;
        }
        if (target<nums[0]) {
            // if not base case, target on RHS
            left = i;
            right = nums.length-1;
        }
        
        while(left<=right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid-1;
            if (nums[mid] < target) left = mid+1;
        }
        
        return -1;
    }
}

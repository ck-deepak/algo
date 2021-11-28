/*
    TC: O(log N) 1 pass
    SC: O(1)

    Drawing a line graph to see the different points, left subarray, inflextion point from rotation, right subarray
    both the subarrays will be sorted internally, we just need to know which subarray to search

*/

class Solution2 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        // normal binary search
        while (start <= end) {
            //pivot point
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid; // target found
            
            // if this condition is true, it means that we are before the inflextion point from rotating, check from left
            if (nums[mid] >= nums[start]) {
                // check if target is in this LHS sub array
                if (target >= nums[start] && target < nums[mid]) 
                    end = mid - 1;
                // else target is in the right side from inflextion
                else start = mid + 1;
                
            // on next iteration, it can now be in the subarray after inflextion so we need the below check
            }
            // check from right
            else {
                 // check if target is in this RHS sub array
                if (target <= nums[end] && target > nums[mid]) 
                    start = mid + 1;
                // else target is the left side from inflextion
                else end = mid - 1;
            }
        }
        return -1;
      }
}

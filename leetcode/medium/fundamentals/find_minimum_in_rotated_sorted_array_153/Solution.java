/*
 TC: O(log N)
 SC: O(1)
 
 Key pattern to recognize is that if a mid is larger than the last element, that means the inflexion point has not happened yet, so we move to the right, and increment start to mid+1
 
 if mid is smaller than last element, then the inflexion has been reached and we have to move left, end = mid
 
*/


class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        
        // take note its not start<=end like normal binary search, as
        while(start<end) {
            if(nums[start] < nums[end]) break;
            int mid = (start+end)/2;
            if (nums[mid]>nums[end]) {
                start = mid+1;
            } else end = mid;
        }
        return nums[start];
    }
}

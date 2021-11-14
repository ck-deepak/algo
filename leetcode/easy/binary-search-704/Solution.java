/*

Time complexity: O(log N)
Space complexity: O(1)

left to right bound search for middle element

Criteria: array is sorted 
(sometimes good to sort and then do multiple short operations like binary search) 

Essentially, by halfing your search limit each iteration, O(log N) is achieved

*/

class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        int mid = (right+left)/2;
        
        // necessary to have <= as it might exactly the middle element
        while (left<=right) {
            
            if (nums[mid] < target) left = mid+1; 
            if (nums[mid] > target) right = mid-1;
            if (nums[mid] == target) return mid;
            
            // update the middle pointer with floor division
             mid = (left + right)/2;
        }
        
        return -1;
    }
}

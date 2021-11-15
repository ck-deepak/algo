/*

Time complexity: O(log N)
Space complexity: O(1)

To note: BS ends with array size 1 and we just have to check whether to insert
after or before the final sub array

Condition: array is already sorted, and has distinct values

*/


// if public modifier is not provided then class can only be accessed in the same package
class Solution {
	public int searchInsert(int[] nums, int target) {
		int start = 0, end = nums.length-1, mid = 0;

		while (start<end) {
			mid = start + (end-start)2;
			if (nums[mid] > target) end = mid-1;
			if (nums[mid] < target) start = mid+1;
			if (nums[mid] == target) return mid;
		}
		if (target<=nums[start]) return start;
		return start+1; // at this point, only a subarray of size 1 is found, so start+1 is next position
				// if target is smaller than the 1 size subarray, index to insert should be the 1st ie start
	}
}


/*

Time complexity: O(N)
Space complexity: O(1)

Have to do this without copying array/in-place

Best way is to have a pointer to keep track of non-zero numbers and pass that pointer 

*/
class Solution {
	public void moveZeroes(int[] nums) {

		// j pointer to track where last non zero num is to be inserted
		int j =0;
		for (int i=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				if (i>j) {
					// don't need temp variable as this is not a swap, we know the value for the right side swap  is always 0
					nums[j] = nums[i];
					nums[i] = 0;
				}
			}
			j++;
		}
	}
}

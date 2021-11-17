
/*

Time complexity: O(N)
Space complexity: O(1)

Algo depends on knowing that rotations are a 3 step reversal operation
1. Reverse array
2. Reverse now from start to rotations index
3. Reverse now from rotations index to end of array
4. Knowing how to swap elements without using more memory
*/


class Solution {
	public void rotate(int[] nums, int k) {
		int size = nums.length;
		// this is a key condition to realize, ie k = k%size, this finds the exact mark where the start index moves to
		k %= size;
		swap(nums, 0, size-1);
		swap(nums, 0, k-1);
		swap(nums, k, size-1);
	}

	private void swap(int[] nums, int i, int j) {
		while(i<j) {
			int temp = nums[i];
        		nums[i] = nums[j];
        		nums[j] = temp;
			i++;
			j--
		}
	}
}

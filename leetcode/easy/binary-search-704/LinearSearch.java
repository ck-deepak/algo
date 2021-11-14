/*

Time complexity: O(N)
Space complexity: O(1)

Textbook left to right pointer search to middle algo

Criteria: When array is not sorted, linear search is probably better

*/

class LinearSearch {
        public int search(int[] nums, int target) {
                int left = 0;
                int right = nums.length-1;

		// necessary to be >= as target could be the exact middle index
                while (right>=left) { 
                        if (nums[right] == target) return right;
                        if (nums[left] == target) return left;
                        right--;
                        left++;
                 
                }
                return -1;
        }
}


/*

Time complexity: O(n)
Space complexity: O(n)

Condition: This problem checks if you can use two pointers to
compare two numbers in an array effectively, key criteria is that
array is sorted (even with negatives)

*/

class Solution {
        public int[] sortedSquares(int[] nums) {
                int start = 0, end = nums.length-1, left = 0, right = 0, index = end;

                int[] result = new int[nums.length];

		// make sure you get the bounds right including the = cases (<= not <)
                while (index >= 0 && start<=end) {

			// Math library statically accessed
                        left = Math.abs(nums[start]);
                        right = Math.abs(nums[end]);

                        if (left>right) {
                                result[index] = left*left;
                                start++;
                        } else {
                                result[index] = right*right;
                                end--;
                        }
                        index--;
                }
            return result;
        }
}

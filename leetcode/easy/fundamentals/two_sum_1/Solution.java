/*

Time complexity: O(n)
Storage complexity: O(n)

*/ 

class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		// int[] result = new int[2];
		
		for (int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				// the complement is the first index
				// result[0] = map.get(complement);
				// result[1] = i
				// return result;

				return new int[] { map.get(complement), i };
				// above way to declare and initialize array at once
				// 1 ms from above method, 4 ms from commented code
			} 
			map.put(nums[i], i);
		}
		return null;
	}
}

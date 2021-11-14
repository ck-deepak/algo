/*

Time complexity: O(n)
Storage complexity: O(n)

*/ 

class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		for (int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) {
				result[0] = i;
				result[1] = map.get(complement);

				// return new int[] { map.get(complement), i };
				// above way to declare and initialize array at once
			} 
			map.put(nums[i], i);
		}
		return result;
	}
}

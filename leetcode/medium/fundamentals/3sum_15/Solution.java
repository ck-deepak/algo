class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums); // N log N
        List<List<Integer>> result = new ArrayList<>();
        
        // we need to check if nums[i] less than 0 and stop as if the new value is >0 and since sorted, no further values can sum to 0
        for (int i=0; i<nums.length && nums[i]<=0;i++) {
            // check for duplicates since sorted
            if (i==0 || nums[i-1] != nums[i]) {
                twoSum(nums, i, result);
            }       
        }
        return result;
    }
    
    // two sum for sorted array // O(N)
    public void twoSum(int[] nums, int cur, List<List<Integer>> result) {
        int low=cur+1, high=nums.length-1;

        while(low<high) {
                int sum = nums[low] + nums[high] + nums[cur];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[cur], nums[low++], nums[high--]));
                    
                    // skip the duplicates within the search
                    while(low<high && nums[low] == nums[low-1]) {
                        low++;
                    }
                }
                else if (sum < 0) low++;
                else high--;
        }
    }
}

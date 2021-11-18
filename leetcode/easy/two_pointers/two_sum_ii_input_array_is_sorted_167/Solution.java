/*

Time complexity: O(N)
Space complexity: O(1)


Conditions:
Non decreasing order (could have same numbers, hence not ascending)
Exactly one solution

Since input array is sorted, we can take advantage of that and avoid hashmap
and do a binary search within the array to find the pairs

*/

class Solution {
        public int[] twoSum(int[] numbers, int target) {
                int low=0, high=numbers.length-1;
            
                while(low<high) {
                        int sum = numbers[low] + numbers[high];
                        if (sum == target) return new int[] {low+1,high+1}; 
                        else if (sum < target) low++;
                        else high--;
                }
                return new int[2];
        }
}

/*
Time complexity : O(N) one pass
Space complexity: O(256) ~ constant

Two pointer: Sliding window problem
Expanding and contracting window with pointers

This solution takes advantage of the fact that each ASCII characters (256) has
a unique int value as well

It uses the index of the array as a key to ASCII character and value as the length
of the window to that character if repeated

*/
class Solution {
        public int lengthOfLongestSubstring(String s) {
                int result = 0;
                int[] arr = new int[256]; // this can be made shorter if only alphabets in tests
                
                //j is the start pointer which can get reset, i is the end pointer which expands
                for (int i = 0, j = 0; i < s.length(); i++) {
                    // if unique int ASCII value exists in array , reset start position
                    j = arr[s.charAt(i)] > 0 ? Math.max(j,arr[s.charAt(i)]) : j;
                        
                    // add the length of the end window the char int index in array
                    arr[s.charAt(i)] = i + 1;
                        
                    // always retain the max of either the previous longest or current length (i-j+1)
                    result = Math.max(result, i - j + 1);
                }
                return result;
            }
}

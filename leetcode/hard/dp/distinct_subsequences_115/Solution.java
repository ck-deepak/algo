/*

Time complexity : O(M x N)
Space comeplxity: O(N)

DP iterative approach with memoization, in this case better and easier than recursive approach

*/

class Solution {
    public int numDistinct(String s, String t) {
        
            int m = s.length();
            int n = t.length();
                
            int[] dp = new int[n];
            int prev = 1;

            // interate over strings in reverse to model recursive solution
            for (int i = m - 1; i >= 0; i--) {
                // at each new character in source start with last value in row which is always 1.
                prev = 1;
                for (int j = n - 1; j >= 0; j--) {
                    
                    // record the current value in the cell
                    int old_dpj = dp[j];
                    
                    // if match, add the result of next recursive call
                    if (s.charAt(i) == t.charAt(j)) {
                            dp[j] += prev;
                    }
                    
                    // this ensures that the loop will increment only by the num of the old value of the occurence of the letter
                    prev = old_dpj;
                }
            }
            return dp[0];
        }
}

/*

 Time complexity : O(N)
 Space complexity : O(26) ~ constant
 
 Bottom Up DP approach, without memoization, iterative approach

*/

class Solution {
        public int distinctSubseqII(String s) {
                // math pow returns double, so convert to int
                int MOD = (int) Math.pow(10, 9) + 7;
                
                // pattern to recognize is count = prevCount * 2 - frequency of duplicate subsequences                  from repeating characters
                int N = s.length(), prevCount = 1, count = 1;
                
                // store latest subsequences count from each character in s
                // default values of new initialized int array is 0
                int[] last = new int[26];
                
                for (int i = 0; i < N; ++i) {
                        // get current character from ASCII position relative to 'a'
                        int c = s.charAt(i) - 'a';
                        
                        // always do modulo when updating counter to avoid overflow problems
                        // (10+10)%4 = 10%4 + 10%4
                        count = prevCount * 2 % MOD;
                        
                        // remove count of duplicate subsequences that end with current character
                        count -= last[c];
                        
                        // if count >0, modulo it once more to get the answer, if less then add                                modulo 
                        count = count>0? count%MOD : count+MOD;
                        last[c] = prevCount;
                        prevCount = count;
                        
                }
                count--;
                return count;
            }

}

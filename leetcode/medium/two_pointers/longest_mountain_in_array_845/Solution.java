/*
 Time complexity: O(N)
 Space comelexity: O(1)
 
 Condition to understand:
 Without loss of generality, a mountain can only start after the previous one ends.

This is because if it starts before the peak, it will be smaller than a mountain starting previous; and it is impossible to start after the peak.

*/

class Solution {
    public int longestMountain(int[] arr) {
        int N = arr.length;
        int ans = 0, base = 0;
        
        while (base<N) {
            // start from left of array
            int i = base;
            
            // check if next follows maintain climbing pattern
            if (i+1<N && arr[i] < arr[i+1]) {
                
                // climb till peak and increase position i
                while(i+1<N && arr[i] < arr[i+1]) i++;
                
                // now check if mountain descending pattern
                if (i+1<N && arr[i] > arr[i+1]) {
                    
                    //descend until end of mountain and increase position i
                    while (i+1<N && arr[i] > arr[i+1]) i++;
                    
                    // answer is max of prev answers and current lenght (i-base+1)
                    ans = Math.max(ans, i-base+1);
                }
            }
            
            // if not mountain climbing pattern, increment base by 1
            // but if it is a mountain pattern, then make base as the end of prev
            // mountain, hence this max condition
            base = Math.max(i, base+1);
        }
        return ans;
    }
}

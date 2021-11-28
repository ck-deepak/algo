/*

    Time complexity : O(N)
    Space complexity : O(1)

*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        result[0]=1;
        
        for (int i=1; i<nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        
        int rightProduct = 1;
        for (int i=nums.length-1; i>=0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
}

//     TC: O(N), SC: O(N)

//     public int[] productExceptSelf(int[] nums) {
//         int N = nums.length;
//         int[] left = new int[N];
//         int[] right = new int[N];
        
//         left[0]=1;
//         right[N-1]=1;
        
//         for (int i=1; i<N; i++) {
//             left[i] = left[i-1] * nums[i-1];
//             right[N-1-i] = right[N-1-i+1] * nums[N-1-i+1];
//         }
        
//         for (int i=0; i<N; i++) {
//             nums[i] = left[i] * right[i];
//         }
        
//         return nums
//     }
    
    
    
    
//     Time comeplexity for this is O(N^2)            
//     public int[] productExceptSelf(int[] nums) {
        
//         int[] result = new int[nums.length];
        
//         for (int i=0; i<nums.length; i++) {
//             int temp = 1;
//             for (int j=0; j<nums.length;j++) {
//                 if (i!=j) 
//                     temp = nums[j] * temp;
//             }
//             result[i] = temp;
//         }
//         return result;
//     }

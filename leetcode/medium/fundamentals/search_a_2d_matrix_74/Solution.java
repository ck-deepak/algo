/*

    TC: O(N) 
    SC: O(1)

*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // O(N)
        for (int i=0; i<m; i++) {
            if (matrix[i][n-1] >= target) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }
    
    
    // O (log N) solution
    public boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        
        while (start<=end) {
            int mid = (start+end)/2;
            
            if (arr[mid] == target) {
                return true;
            }
            
            if (arr[mid] < target) {
                start = mid+1;
            }
            
            if (arr[mid] > target) {
                end = mid-1;
            }
        }

        return false;
    }
}

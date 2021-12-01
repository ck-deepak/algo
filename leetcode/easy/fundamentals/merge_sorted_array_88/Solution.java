class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if (n==0) return;
        
        // Make a copy of the first m elements of nums1 // O(N)
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }
        
        // Read pointers for nums1Copy and nums2 respectively.
        int p1 = 0;
        int p2 = 0;
        
        for (int p = 0; p < m + n; p++) {
            // check for bounds of nums1copy and nums2
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
    }
}

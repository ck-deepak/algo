class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int minLength = Math.min(nums1.length, nums2.length);
        ArrayList<Integer> arr = new ArrayList<>();
        
        // store vals and frequency of nums2
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i=0; i<nums2.length; i++)  {
            if (hashMap.containsKey(nums2[i])) {
                hashMap.put(nums2[i], hashMap.get(nums2[i])+1);
            } else {
                hashMap.put(nums2[i], 1);
            }
        }
        
        for (int i=0; i<nums1.length; i++) {
            if (hashMap.containsKey(nums1[i]) && hashMap.get(nums1[i]) > 0) {
                arr.add(nums1[i]);
                hashMap.put(nums1[i], hashMap.get(nums1[i])-1);
            }
        }
        
        int[] result = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}

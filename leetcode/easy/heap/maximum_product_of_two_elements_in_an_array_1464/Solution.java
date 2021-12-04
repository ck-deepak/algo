class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            heap.add(num);
        }
        int i = heap.poll()-1;
        int j = heap.poll()-1;
        return i*j;
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        // natural order (min heap)
        PriorityQueue<Pair> heap = new PriorityQueue<>(new SoldierComparator());
        int[] result = new int[k];
        
        for (int i=0; i<m; i++) {
            int solCount = 0;
            for (int j=0; j<n; j++) {
                if (mat[i][j] == 0) break;
                solCount++;
            }
            heap.add(new Pair(solCount, i));
        }
        
        for (int i=0; i<k; i++) {
            result[i] = heap.poll().index;
        }
        
        return result;
    }
}

class Pair {
    int count;
    int index;
    
    public Pair(int c, int i) {
        this.count = c;
        this.index = i;
    }
}

class SoldierComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair a, Pair b) {
        if (a.count == b.count) {
            return a.index - b.index;
        } else {
            return a.count - b.count;
        }
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] result = new int[k][2];
        
        if (points.length<2) {
            return points;
        }
        
        // natural order
        PriorityQueue<Point> heap = new PriorityQueue<>(new DistanceComparator());
        int r = points.length;        
        for (int i=0; i<r; i++) {
            double d = getEuclideanDistance(0,0, points[i][0], points[i][1]);
            heap.add(new Point(points[i][0], points[i][1], d));
        }
        
        for (int i=0; i<k; i++) {
            Point p = heap.poll();
            result[i][0] = p.xCoordinate;
            result[i][1] = p.yCoordinate;
        }
        
        return result;
    }
    
    public double getEuclideanDistance(int x1, int y1, int x2, int y2) {
        double left = Math.pow((double)(x1-x2),2);
        double right = Math.pow((double)(y2-y1),2);
        return Math.sqrt(left+right);
    }
}

class Point {
    int xCoordinate;
    int yCoordinate; 
    double euclideanDistance;
    
    public Point (int x, int y, double d) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.euclideanDistance = d;
    }
}

class DistanceComparator implements Comparator<Point> {
    @Override
    public int compare(Point a, Point b) {
        if ((a.euclideanDistance - b.euclideanDistance)>0.0) {
            return 1;
        } else 
            return -1;
    }
}

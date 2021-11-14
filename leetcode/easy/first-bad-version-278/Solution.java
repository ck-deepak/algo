/* 

The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);
 */

public class Solution extends VersionControl {
	 public int firstBadVersion(int n) {
		// multiple declaration
		 int start = 1, int end = n;
		while (start < end) {
            
			// int mid = (start+end)/2
            		// above way won't work due to overflow problem (2^30 + 2^31-2)
        
           		 // necessary to do it like this to avoid overflow
            		int mid = start + (end - start)/2;
            
           		 // if not bad version, expand version, go right
            		if (!isBadVersion(mid)) start = mid + 1;
            
            		// else contract, go left
            		else end = mid;
        	}
        	return start;
    	}   
}

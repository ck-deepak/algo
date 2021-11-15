/* 

The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);

Time complexity: O(log N)
Space complexity: O(1)

Binary search problem with floating target and overflow problem

Generally in binary search you have >target, <target or == target
but since this problem has "floating" target or you can't directly ==
you have to do do the Binary Search, until condition satisfied

 */

public class Solution extends VersionControl {
	 public int firstBadVersion(int n) {
		// multiple declaration
		 int start = 1, end = n, mid = 0;

		while (start < end) {
            
			// mid = (start+end)/2
            		// above way won't work due to overflow problem (2^30 + 2^31-2)
        
           		 // necessary to do it like this to avoid overflow
            		mid = start + (end - start)/2;
            
           		 // if not bad version, expand; go right
            		if (!isBadVersion(mid)) start = mid + 1;
            
            		// else contract, go left but don't do mid-1, as mid may be the last bad version
            		else end = mid;
			// if you add an early terminate code (check mid-1  is bad version directly) its somehow 3 ms slower on leetcode
			// probably because of the test case design on leetcode, theoretically this should be better
       			/* Something like this
			 else {
                                if (mid!=1 && !isBadVersion(mid-1)) {
                                        return mid;
                                }
                                end = mid;
                        }
			*/
        	}

		// return start as you want the first/smallest possible bad version
        	return start;
    	}   
}


/*
 Time complexity : 
 Space complexity:

Takes advantage of the fact that all ascii characters have a unique int value


How do we know string p is a permutation of string s? Each character in p is in s too. 
So we can abstract all permutation strings of s to a map (Character -> Count). i.e. abba -> {a:2, b:2}. 
Since there are only 26 lower case letters in this problem, we can just use an array to represent the map.

How do we know string s2 contains a permutation of s1? We just need to create a sliding window with length of s1, 
move from beginning to theend of s2. When a character moves in from right of the window,
we subtract 1 to that character count from the map. When a character moves out from left of the window,
we add 1 to that character count. So once we see all zeros in the map, meaning equal numbers of every characters 
between s1 and the substring in the sliding window, we know the answer is true.

*/

class Solution {
        public boolean checkInclusion(String s1, String s2) {
                int len1 = s1.length(), len2 = s2.length();
                // corner case
                if (len1 > len2) return false;

                int[] count = new int[26];
                // initialize the count for each unique character
                for (char c : s1.toCharArray()) {
                        // minus 'a' will give you the exact alphabet int value in ASCII relative to a
                        count[c - 'a'] ++;
                }
                // initialize the sliding window with static size len1
                int i = 0, j = 0, counter = len1;
		// this is how you can loop variables to use outside of for scope 
                // intially fill the window array
		while (j < len1) {
			// this means decrement the value in the array by 1 if found in array while increasing j
			// but no matter what, for the char, reduce the value in array by 1 even if not >0, 
			// but only reduce counter if that val>0
                        if (count[s2.charAt(j++) - 'a']-- > 0) {
				// reduce the counter as well
                                counter --;
                        }
                }


		// if counter is not 0 means that not all the characters were found in the first fill of the window
		// continue to fill the window and check until all characters are the same using counter
               	// continue till j reaches end of s2 or counter is 0, meaning a match was found
		 while (j < len2 && counter != 0) {
			
			// if duplicate found, add element from left, adding counter
                        if (count[s2.charAt(i++) - 'a']++ >= 0) counter ++;

			// adding elements in the right
                        if (count[s2.charAt(j++) - 'a']-- > 0) counter --;
                }
                return counter == 0;
        }
}

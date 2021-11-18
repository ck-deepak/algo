/*

Time complexity:
Space complexity: In-place memory / O(1) 


Two pointers to reverse in one pass,
take not its start<end and not start<=end as you don't need to swap middle
*/

class Solution {
	public void reverseString(char[] s) {
		int start=0,end=s.length-1;
		
		while(start<end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	
	}
}

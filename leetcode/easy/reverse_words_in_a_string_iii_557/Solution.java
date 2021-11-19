
/*

Time complexity:
Space complexity:

Note this is not in-memory as return type is not void

*/

class Solution {
        public String reverseWords(String s) {
                int start=0, end = s.length()-1;
                char[] words = s.toCharArray();
		
		// iterate through till you find a space and then reverse word
                for (int i=0; i<words.length; i++) {
                        if (words[i]==' ') {
                                reverseWord(words,start, i-1);
				// update start position when word to reverse is found 
                                start = i+1;
                        }
                
                }
                // reverse for the last word that will not have whitespace after it
                reverseWord(words, start, end);
                return new String(words);
        }

        private void reverseWord(char[] s,int i,int j) {
                while (i<j) {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    i++;
                    j--;
                }
        }
}

Given a string s, return the number of __distinct non-empty subsequences of s__. Since the answer may be very large, return it **modulo** 10^9 + 7.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not.

**Example 1:**
<pre>
<b>Input:</b> s = "abc"
<b>Output:</b> 7
<b>Explanation:</b> The 7 distinct subsequences are "a", "b", "c", "ab", "ac", "bc", and "abc".
</pre>

**Example 2:**
<pre>
<b>Input:</b> s = "aba"
<b>Output:</b> 6
<b>Explanation:</b> The 6 distinct subsequences are "a", "b", "ab", "aa", "ba", and "aba".
</pre>

**Example 3:**
<pre>
<b>Input:</b> s = "aaa"
<b>Output:</b> 3
<b>Explanation:</b> The 3 distinct subsequences are "a", "aa" and "aaa".
</pre>

**Constraints:**
- 1 <= s.length <= 2000
- s consists of lowercase English letters.

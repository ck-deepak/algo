Given an array of integers `arr`, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with `0 < i < arr.length - 1` such that:
<pre>
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
</pre>

**Example 1:**
<pre>
Input: arr = [2,1]
Output: false
</pre>

**Example 2:**
<pre>
Input: arr = [3,5,5]
Output: false
</pre>

**Example 3:**
<pre>
Input: arr = [0,3,2,1]
Output: true
</pre>

**Constraints:**
1 <= arr.length <= 10^4
0 <= arr[i] <= 10^4

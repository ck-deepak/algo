Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**

<pre>
<b>Input:</b> nums = [1,3,5,6], target = 5
<b>Output:</b> 2
</pre>

**Example 2:**
<pre>
<b>Input:</b> nums = [1,3,5,6], target = 2
<b>Output:</b> 1
</pre>

**Example 3:**
<pre>
<b>Input:</b> nums = [1,3,5,6], target = 7
<b>Output:</b> 4
</pre>

**Example 4:**
<pre>
<b>Input:</b> nums = [1,3,5,6], target = 0
<b>Output:</b> 0
</pre>

**Example 5:**
<pre>
<b>Input:</b> nums = [1], target = 0 
<b>Output:</b> 0
</pre>

**Constraints:**

<pre>
- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums contains <b>distinct</b> values sorted in <b>ascending</b> order.
- -10^4 <= target <= 10^4
</pre>

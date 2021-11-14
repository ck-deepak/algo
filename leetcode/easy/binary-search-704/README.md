Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return `-1`.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**

<pre>
<b>Input:</b> nums = [-1,0,3,5,9,12], target = 9
<b>Output:</b> 4
<b>Explanation:</b> 9 exists in nums and its index is 4
</pre>

**Example 2:**
<pre>
<b>Input:/<b> nums = [3,2,4], target = 6
<b>Output:/<b> [1,2]
</pre>

**Example 3:**
<pre>
<b>Input:</b> nums = [3,3], target = 6
<b>Output:</b> [0,1]
</pre>

**Constraints:**
- 1 <= nums.length <= 10^4
- -10^4 < nums[i], target < 10^4
- All the integers in `nums` are **unique**.
- `nums` is sorted in ascending order.

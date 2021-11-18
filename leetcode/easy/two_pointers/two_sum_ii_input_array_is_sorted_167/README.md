Given a **1-indexed array** of integers numbers that is already _sorted in non-decreasing order_, find two numbers such that they add up to a specific `target` number. Let these two numbers be `numbers[index1]` and `numbers[index2]` where `1 <= index1 < index2 <= numbers.length.`

Return the indices of the two numbers, `index1 and index2`, added by one as an integer array `[index1, index2]` of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

**Example 1:**
<pre>
<b>Input:</b> numbers = [2,7,11,15], target = 9
<b>Output:</b> [1,2]
<b>Explanation:</b> The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
</pre>

**Example 2:**
<pre>
<b>Input:</b> numbers = [2,3,4], target = 6
<b>Output:</b> [1,3]
<b>Explanation:</b> The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
</pre>

**Example 3:**
<pre>
<b>Input:</b> numbers = [-1,0], target = -1
<b>Output:</b> [1,2]
<b>Explanation:</b> The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
</pre>

**Constraints:**

- 2 <= numbers.length <= 3 * 104
- -1000 <= numbers[i] <= 1000
- numbers is sorted in non-decreasing order.
- -1000 <= target <= 1000
- The tests are generated such that there is exactly one solution.

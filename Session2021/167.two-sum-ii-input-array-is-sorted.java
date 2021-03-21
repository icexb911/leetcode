/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length ==0) return new int[]{0,0};
        int start = 0, end = numbers.length-1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{start+1, end+1};
            }
            else if (sum >= target) {
                end --;
            }
            else {
                start++;
            }
        }
        return new int[]{0,0};
    }
}
// @lc code=end


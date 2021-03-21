/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length<2) return;
        int old = 0, cur = 0;
        while ( old < nums.length) {
            if (nums[old]!=0) {
                if (nums[cur]!=nums[old]) {
                    nums[cur] = nums[old];
                }
                cur++;
            }
            old++;
        }
        while(cur<nums.length) {
            nums[cur] = 0;
            cur++;
        }
    }
}
// @lc code=end


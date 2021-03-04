/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<2) return 1;
        int p = 0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]!=nums[p]) {
                p++;
                nums[p] = nums[i];
            }
        }
        return p+1;
    }
}
// @lc code=end


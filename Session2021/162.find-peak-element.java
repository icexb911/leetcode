/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length ==0) return -1;
        if (nums.length == 1) return 0;
        if (nums.length == 2) return nums[0] <= nums[1]? 1: 0;
        int start = 0, end = nums.length -1 ;
        while (start +1 < end) {
            int mid = start + (end - start)/2;
            if (nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if (nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        return nums[start] >= nums[end]? start: end;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{ -1, -1};
        int index = binarySearch(nums, target);
        if (index == -1) return new int[] {-1, -1};

        int start = index, end = index;
         
            while (start>=0 && nums[start] == target ) {
                start--;
            }
            while (end<nums.length && nums[end] == target) {
                end++;
            }
        
        return new int[]{start+1, end-1};

    }

    private int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while (start+1< end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }

        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
        
    
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start>=end) return;

        int left = start, right = end;
        int pivot = nums[(start+end)/2];
        while (left<=right) {
            while (left<=right && nums[left]<pivot) {
                left++;
            }
            while (left<=right && nums[right]>pivot) {
                right--;
            }
            if (left<=right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }

        quickSort(nums, start, right);
        quickSort(nums, left, end);
    }
}
// @lc code=end


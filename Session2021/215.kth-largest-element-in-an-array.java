/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length-1, k);
    }

    private int quickSelect(int[] nums, int start, int end, int k) {
        if (start == end) return nums[start];
        int i = start, j = end;
        int pivot = nums[(i+j)/2];
        while (i<=j) {
            while (i<=j && nums[i]>pivot) {
                i++;
            }
            while (i<=j && nums[j]<pivot) {
                j--;
            }
            if (i<=j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j--;
            }
        }

        if (start+k-1 <= j) {
            return quickSelect(nums, start, j, k);
        }
        if (start+k-1 >= i) {
            return quickSelect(nums, i, end, k - (i-start));
        }

        return nums[j+1];
    }
}
// @lc code=end


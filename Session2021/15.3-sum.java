/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++) {
            if (nums[i]>0) { break;}
            if (i>0 && nums[i] == nums[i-1]) {
               continue; 
            }
            twoSum(nums, i+1, nums.length-1, -nums[i], result);
        }
        return result;
    }

    private void twoSum(int[] nums, int start, int end, int target, List<List<Integer>> result) {
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                List<Integer> rec = new ArrayList<Integer>();
                rec.add(-target);
                rec.add(nums[start]);
                rec.add(nums[end]);
                result.add(rec);
                start++;
                end--;
                while (start<end && nums[start] ==  nums[start-1]) {
                    start++;
                }
                while (start<end && nums[end] ==  nums[end+1]) {
                    end--;
                }
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=658 lang=java
 *
 * [658] Find K Closest Elements
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }
        int pos = findfirstIndex(arr,  x);
        int left = pos -1;
        int right = pos;
        for (int i=0;i<k;i++) {
            if (left<0) {
                right++;
            }
            else if(right>=arr.length) {
                left--;
            }
            else {
                if ( x - arr[left] <= arr[right] - x) {
                    left--;
                }
                else {
                    right++;
                }
            }
        }

        for (int i = left+1;i<right;i++) {
            result.add(arr[i]);
        }
        return result;
    }

    private int findfirstIndex(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while ( start+1 < end) {
            int mid = start+(end-start)/2;
            if (arr[mid] < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }

        if (arr[start] >= target) {
            return start;
        }

        if (arr[end] >= target) {
            return end;
        }
        return arr.length;
    }
}
// @lc code=end


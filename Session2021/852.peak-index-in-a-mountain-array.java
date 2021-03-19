/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr== null || arr.length==0) return -1;
        if (arr.length == 0) return arr[0];

        int start = 0, end = arr.length-1;
        if (start+1<end) {
            int mid = start+(end-start)/2;
            if (arr[mid-1] < arr[mid] && arr[mid+1] < arr[mid]) {
                return mid;
            }
            if (arr[mid-1] > arr[mid]) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (arr[start] > arr[end]) { return start;};
        if (arr[start] < arr[end]) {return end;}
        return -1;
    }
}
// @lc code=end


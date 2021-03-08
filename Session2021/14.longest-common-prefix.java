/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length ==0) return "";
        if (strs.length == 1) return strs[0];

        String result = strs[0];
        for (int i=0;i<strs.length;i++) {
            if (result.length()>strs[i].length()) {
                result = result.substring(0, strs[i].length());
            }
            while (strs[i].indexOf(result)!=0) {
                result = result.substring(0, result.length()-1);
            }
        }
        return result;

    }
}
// @lc code=end

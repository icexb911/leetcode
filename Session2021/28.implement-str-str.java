/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.equals(needle) || needle.equals("")) {
            return 0;
        }
         
        for (int i=0;i<=haystack.length() - needle.length();i++) {
            if (haystack.charAt(i) != needle.charAt(0)) continue;
            String substring = haystack.substring(i, i+needle.length());
            if (substring.equals(needle)) {
                return i;
            }
            else {
                continue;
            }
        }
        return -1;
        
    }
}
// @lc code=end


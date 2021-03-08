/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        /*
        if (s == null || s.length() ==0) return 0;
        String[] words = s.split(" ");
        if (words.length ==0) return 0;
        return words[words.length-1].length();*/
        if (s == null || s.length() ==0) return 0;
        int count = 0;
        int i = s.length()-1;
        while (i>=0 && s.charAt(i)== ' ' ) {i--;}
        for (;i>=0;i--) {
            if (s.charAt(i) == ' ') return count;
            count++;
        }
        return count;
    }
}
// @lc code=end


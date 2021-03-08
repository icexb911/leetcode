/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals(magazine)) {
            return true;
        }

        if (magazine.equals(" ")) {
            return false;
        }

        int[] fre = new int[26];
        for(int i=0;i<magazine.length();i++) {
            fre[magazine.charAt(i) -'a']++;
        }

        for(int i=0;i<ransomNote.length();i++) {
            fre[ransomNote.charAt(i) -'a']--;
            if (fre[ransomNote.charAt(i)-'a']<0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end


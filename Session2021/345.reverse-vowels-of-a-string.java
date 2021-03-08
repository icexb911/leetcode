/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) return s;
        int start = 0, end = s.length()-1;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        while (start<end) {
            while (start<end&&
            !set.contains(chars[start])) {
                start++;
            }
            while (start<end&&!set.contains(chars[end])) {
                end--;
            }
            if (start>=end) break;
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;

        }
        return String.valueOf(chars);
    }
}
// @lc code=end


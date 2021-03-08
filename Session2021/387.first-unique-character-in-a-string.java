2import java.util.Map;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    /*
    public int firstUniqChar(String s) {
        //Map<Character, Integer> map = new HashMap<>();
        int[] fre = new int[26];
        for (Character c : s.toCharArray()) {
            fre[c - 'a']++;
        }
        for (int i=0;i<s.length();i++) {
            if(fre[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }*/
    public int firstUniqChar(String s) {
        if (s== null || s.length()==0) return -1;
        if (s.length()==1) return 0;
        int slow = 0, fast = 1;
        int[] fre = new int[26];
        fre[s.charAt(slow)-'a']++;
        while (slow<s.length() && fast<s.length()) {
            fre[s.charAt(fast)-'a']++;
            while (slow<s.length() &&fre[s.charAt(slow)-'a']>1) slow++;
            fast++;
        }
        return slow == s.length()? -1 : slow;
    }

}
// @lc code=end


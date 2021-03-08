import java.util.List;

/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() ==0 || s.indexOf(" ")<0) return s;
        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<s.length();i++) {
            if (Character.isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
            else {
                if (sb.length() == 0) {
                    System.out.println(sb.toString());
                    arr.add(sb.toString());
                    sb = new StringBuilder();
                }              
                
            }
        }
        if (sb!=null) {
            arr.add(sb.toString());
        }

        int start = 0, end = arr.size()-1;
        while (start<end) {
            String tmp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, tmp);
            start++;
            end--;
        }
        StringBuilder result = new StringBuilder();
        for (String str: arr) {
            result.append(str).append(" ");
        }
        return result.toString().trim();

    }
}
// @lc code=end


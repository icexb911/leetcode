import java.util.Map;

/*
 * @lc app=leetcode id=299 lang=java
 * Test for update
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        if (secret == guess) {            
            return n+"A0B";
        }
        int cow = 0,bull = 0;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapG = new HashMap<>();
        for (int i=0;i<n;i++) {
            Character s = secret.charAt(i);
            Character g = guess.charAt(i);
            if (s == g) cow++;
            else {
                if (mapG.containsKey(s)){
                    bull++;
                    if (mapG.get(s)==1){
                        mapG.remove(s);
                    }
                    else {
                        mapG.put(s, mapG.get(s)-1);
                    }                    
                }
                else {
                    if (mapS.containsKey(s)) {
                        mapS.put(s, mapS.get(s)+1);
                    }
                    else {
                        mapS.put(s,1);
                    }
                    
                }
                if (mapS.containsKey(g)){
                    bull++;
                    if (mapS.get(g)==1){
                        mapS.remove(g);
                    }
                    else {
                        mapS.put(g, mapS.get(g)-1);
                    }                    
                }
                else {
                    if (mapG.containsKey(g)) {
                        mapG.put(g, mapG.get(g)+1);
                    }
                    else {
                        mapG.put(g,1);
                    }
                    
                }
            }
        }
        return cow+"A"+bull+"B";
    }
}
// @lc code=end


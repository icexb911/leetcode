import java.util.Map;

/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if (n==0) return n;
        Map<Integer, Integer> map = new HashMap<>();
        return compute(n, map);
    }

    private int compute(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) return map.get(n);
        if (n<=2) return 1;
        int num1 = 0, num2 = 0;
        if (map.containsKey(n-1)) {
            num1 = map.get(n-1);
        }
        else {
            num1 = compute(n-1, map);
            map.put(n-1, num1);
        }
        if (map.containsKey(n-2)) {
            num2 = map.get(n-2);
        }
        else {
            num2 = compute(n-2, map);
            map.put(n-2, num2);
        }
        return num1 + num2;
    }
}
// @lc code=end


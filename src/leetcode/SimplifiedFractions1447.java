package leetcode;

import java.util.*;

public class SimplifiedFractions1447 {
    /**
     * 最简分数
     * https://leetcode-cn.com/problems/simplified-fractions/
     * @param n
     * @return
     */
    public static List<String> simplifiedFractions(int n) {
        Set<String> rtn = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int gcd = gcd(j, i);
                if (gcd == 1) {
                    rtn.add((j / gcd) + "/" + (i / gcd));
                }
            }
        }
        return new ArrayList<>(rtn);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(simplifiedFractions(3));
    }
}

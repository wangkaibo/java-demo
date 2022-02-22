package leetcode;

public class LongestPalindrome5 {
    /**
     * 最长回文字符串
     * https://leetcode-cn.com/problems/longest-palindromic-substring/
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        // 中心扩展法
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = extend(s, i, i);
            int len2 = extend(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                // aba 1 3
                start = i - len / 2;
                end = i + (len + 1) / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int extend(String s, int start, int end) {
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}

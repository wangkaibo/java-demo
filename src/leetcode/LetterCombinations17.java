package leetcode;

import java.util.*;

/**
 * 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinations17 {

    private static final Map<Character, List<String>> dict = new HashMap<>();
    static {
        dict.put('2', Arrays.asList("a", "b", "c"));
        dict.put('3', Arrays.asList("d", "e", "f"));
        dict.put('4', Arrays.asList("g", "h", "i"));
        dict.put('5', Arrays.asList("h", "k", "l"));
        dict.put('6', Arrays.asList("m", "n", "o"));
        dict.put('7', Arrays.asList("p", "q", "r", "s"));
        dict.put('8', Arrays.asList("t", "u", "v"));
        dict.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> rtn = new ArrayList<>();
        char[] chars = digits.toCharArray();
        for (char c: chars) {
            rtn = addNum(rtn, c);
        }
        return rtn;
    }
    public static List<String> addNum(List<String> histories, char input) {
        List<String> inputList = dict.get(input);
        List<String> newList = new ArrayList<>();
        if (histories.isEmpty()) {
            newList.addAll(inputList);
        } else {
            for (String old: histories) {
                for (String a: inputList) {
                    newList.add(old + a);
                }
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}

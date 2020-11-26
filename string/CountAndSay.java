package com.example.facerecog.test;

/**
 * @author lihai
 * @date 2020/11/26 16:53
 * 外观数列
 *
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 *
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 *
 * 题目解释不清楚，我来补充说明一下
 *
 * 输入n，输出n-1的描述
 * 怎么描述（eg:21 描述成一个2和一个1，也就是1211）
 * 以下是前五项的外观数列
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 **/
public class CountAndSay {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了72.70% 的用户
     * 内存消耗：35.9 MB, 在所有 Java 提交中击败了89.34% 的用户
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String sum = countAndSay(n - 1);
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < sum.length(); i++) {
            int count = 1;
            while (i < sum.length() - 1 && sum.charAt(i + 1) == sum.charAt(i)) {
                count++;
                i++;
            }
            s.append(count);
            s.append(sum.charAt(i));

        }
        return s.toString();
    }

    public static void main(String[] args) {
        String s = countAndSay(2);
        System.out.println(s);
    }

}

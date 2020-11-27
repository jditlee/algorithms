package com.example.facerecog.test;

import java.util.Arrays;

/**
 * @author lihai
 * @date 2020/11/26 17:47
 * 最长公共前缀
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * <p>
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * <p>
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 **/
public class LongestCommonPrefix {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了88.38% 的用户
     * 内存消耗：36.7 MB, 在所有 Java 提交中击败了61.72% 的用户
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length ==0){
            return "";
        }
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int n = strs[0].length() < strs[strs.length-1].length() ? strs[0].length():strs[strs.length-1].length();
        int i;
        for ( i = 0; i < n; i++) {
            if (strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                break;
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了88.38% 的用户
     * 内存消耗：36.6 MB, 在所有 Java 提交中击败了70.14% 的用户
     * @param strs
     * @return
     */
    public static String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length ==0){
            return "";
        }
        String prefx = strs[0];
        int count = strs.length;
        for (int i = 1; i < count ; i++) {
            prefx = longestCommonPrefix(prefx,strs[i]);
            if (prefx.length()==0) {
                break;
            }
        }
        return prefx;


    }

    public static String longestCommonPrefix(String prefx, String str) {
        int min = Math.min(prefx.length(),str.length());
        int i = 0;
        while (i<min && prefx.charAt(i)==str.charAt(i)){
            i++;
        }
        return prefx.substring(0,i);

    }

    public static void main(String[] args) {
        String[] s = new String[]{"aacd","abd","adc","aacd"};
        System.out.println(longestCommonPrefix(s));
    }
}

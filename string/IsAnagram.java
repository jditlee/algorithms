package com.example.facerecog.test;

import java.util.Arrays;

/**
 * @author lihai
 * @date 2020/11/25 15:47
 * 有效的字母异位词
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 *
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 **/
public class IsAnagram {
    public static Boolean isAnagram(String s,String t){
        if (s.length()!=t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars,chars1);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("hello","olleh"));
        System.out.println(isAnagram("hello","ollea"));
        System.out.println(isAnagram("world","owrld"));
    }
}

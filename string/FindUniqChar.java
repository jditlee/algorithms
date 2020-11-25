package com.example.facerecog.test;

import java.util.HashMap;

/**
 * @author lihai
 * @date 2020/11/25 15:26
 * 字符串中的第一个唯一字符
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 *
 *
 * 提示：你可以假定该字符串只包含小写字母。
 *
 **/
public class FindUniqChar {
    public static int findUniqChar(String s){
        HashMap<Character,Integer> count = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
            
        }
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int i = findUniqChar("helloworld");
        System.out.println(i);
    }
}

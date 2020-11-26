package com.example.facerecog.test;

/**
 * @author lihai
 * @date 2020/11/26 11:10
 * 实现 strStr()
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 **/
public class StrStr {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了50.51% 的用户
     * 内存消耗：36.8 MB, 在所有 Java 提交中击败了95.26% 的用户
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle ){


        int hi = haystack.length();
        int ni = needle.length();

        for (int i =0;i<=hi-ni;i++){
            int j;
            for (j=0;j<ni;j++){
                if (needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }

            }
            if (j==ni){
                return i;
            }
        }

        return -1;

    }

    /**
     * 草！！！
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
     * 内存消耗：37 MB, 在所有 Java 提交中击败了88.29% 的用户
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr1(String haystack, String needle ){

        int i1 = haystack.indexOf(needle);
        return i1;
    }

    /**
     * indexOf源码
     * @param source
     * @param sourceOffset
     * @param sourceCount
     * @param target
     * @param targetOffset
     * @param targetCount
     * @param fromIndex
     * @return
     */
    public static int indexOfCode(char[] source, int sourceOffset, int sourceCount,
                                  char[] target, int targetOffset, int targetCount,
                                  int fromIndex){
        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }

        char first = target[targetOffset];
        int max = sourceOffset + (sourceCount - targetCount);

        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            /* Look for first character. */
            if (source[i] != first) {
                while (++i <= max && source[i] != first);
            }

            /* Found first character, now look at the rest of v2 */
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && source[j]
                        == target[k]; j++, k++);

                if (j == end) {
                    /* Found whole string. */
                    return i - sourceOffset;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int i = "string".indexOf(" ");
        System.out.println(i);
        System.out.println(strStr1("hello","ll"));
    }
}



























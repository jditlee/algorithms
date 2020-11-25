package com.example.facerecog.test;

/**
 * @author lihai
 * @date 2020/11/25 10:56
 整数反转

给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321

 示例 2:

输入: -123
输出: -321

示例 3:

输入: 120
输出: 21

注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0

 **/
public class ReverseInteger {

    public static int reverse(int x){
        int revx = 0;
        while (x!=0){

            int end = x%10;
            x /= 10;

            if (revx > Integer.MAX_VALUE/10 || (revx == Integer.MAX_VALUE/10 && end > 7)) {
                return 0;
            }
            if (revx < Integer.MIN_VALUE/10|| (revx == Integer.MIN_VALUE/10 && end< -8)){
                return 0;
            }

            revx = revx*10 + end;
        }
        return revx;

    }

    public static void main(String[] args) {
        System.out.println(reverse(1234567899));
    }
}

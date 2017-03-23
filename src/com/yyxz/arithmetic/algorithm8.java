package com.yyxz.arithmetic;

import java.util.Scanner;

/**
 * 
 * @author bianxh
 * 求最小公倍数
 * 正整数A和正整数B的最小公倍数是指能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 * 比如输入5和7 ，5和7的最小公倍数是35，则需要返回35。
 * 输入:	输入两个正整数，如：
 * 5 7
 * 输出:	输出最小公倍数，如：
 * 35
 * 样例输入:	5 7
 * 样例输出:	35
 */
public class algorithm8 {
	public static void test() {  
        Scanner scan = new Scanner(System.in);// 接收控制台输入的信息  
  
        System.out.print("请输入第一个整数：");  
        int num1 = scan.nextInt(); // 取出控制台输入的信息  
  
        System.out.print("请输入第二个整数：");  
        int num2 = scan.nextInt(); // 取出控制台输入的信息  
  
        System.out.println("最大公约数 = " + maxCommonDivisor(num1, num2));// 调用maxCommonDivisor()方法  
        System.out.println("最小公倍数  = " + minCommonMultiple(num1, num2));// 调用minCommonMultiple()方法  
    }  
  
    // 递归法求最大公约数  
    public static int maxCommonDivisor(int m, int n) {  
        if (m < n) {// 保证m>n,若m<n,则进行数据交换  
            int temp = m;  
            m = n;  
            n = temp;  
        }  
        if (m % n == 0) {// 若余数为0,返回最大公约数  
            return n;  
        } else { // 否则,进行递归,把n赋给m,把余数赋给n  
            return maxCommonDivisor(n, m % n);  
        }  
    }  
  
    // 循环法求最大公约数  
    public static int maxCommonDivisor2(int m, int n) {  
  
        if (m < n) {// 保证m>n,若m<n,则进行数据交换  
            int temp = m;  
            m = n;  
            n = temp;  
        }  
        while (m % n != 0) {// 在余数不能为0时,进行循环  
            int temp = m % n;  
            m = n;  
            n = temp;  
        }  
        return n;// 返回最大公约数  
    }  
  
    // 求最小公倍数  
    public static int minCommonMultiple(int m, int n) {  
        return m * n / maxCommonDivisor(m, n);  
    }  
}

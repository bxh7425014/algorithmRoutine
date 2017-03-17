package com.yyxz.arithmetic;
/**
 * 
 * @author bianxh
 * 把一个字符串，交换前后顺序后再输出
 * 输入:	字符串
 * 输出:	字符串
 * 样例输入:	abcde
 * 样例输出:	edcba
 */
public class algorithm1 {
	public static void test() {
		String sh = "abcde";
		String reverseStr = new StringBuilder(sh).reverse().toString();
        System.out.println(sh + "交换前后顺序后是：" + reverseStr);
	}
}

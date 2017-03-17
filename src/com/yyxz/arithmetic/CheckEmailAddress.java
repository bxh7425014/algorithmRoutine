package com.yyxz.arithmetic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author bianxh
 * 邮箱地址合法性校验
 * 输入一个电子邮箱地址字符串，要求检查这个邮箱地址是否合法。如果输入的电子邮箱地址是合法的，输出字符串“1”；如果不合法输出字符“0”。
 * 满足如下条件被认为是合法的邮箱地址： 
 *  1、仅包含一个“@”字符  
 *  2、最后三个字符必须是“.com”  
 *  3、字符之间没有空格  
 *  4、有效字符为19、az、AZ、“.”、“@”、“”
 *  输入:
 *  字符串
 *  输出:
 *  是否是有效邮箱名的结果
 *  样例输入:
 *  bian.xh@qq.com
 *  样例输出:
 *  1
 */
public class CheckEmailAddress {
	/**
	 * 正则表达式在线验证地址：http://rubular.com
	 * Email地址有效性校验
	 */
	public static void test() {
		System.out.println("请输入等待校验的Email地址：");
		Scanner inputScanner = new Scanner(System.in);
		String inputEmailAddr = inputScanner.nextLine();
		String check = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_-]+(\\.)com$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(inputEmailAddr);
		boolean isMatched = matcher.matches();
		System.out.println(isMatched ? "1" : "0");
	}
}
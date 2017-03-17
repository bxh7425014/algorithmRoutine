package com.yyxz.arithmetic;

import java.util.Scanner;

/**
 * 
 * @author bianxh
 * 程序实现目标：输入一个字符串，将其各个字符对应的ASCII值加5后，输出结果。
 * 程序要求：该字符串只包含小写字母，若其值加5后的字符值大于'z',将其转换成从a开始的字符。
 */
public class algorithm11 {
	public static void test() {
		System.out.println("请输入待转换待字符串（a-z）：");
		Scanner inputScanner = new Scanner(System.in);
		String inputStr = inputScanner.nextLine();
		inputScanner.close();
		char[] charArray = inputStr.toCharArray();
		for(int index = 0; index < charArray.length; index ++) {
			int asciiValue = charArray[index] + 5;
			if(asciiValue > 'z') {
				asciiValue -= 'a';
				asciiValue %= 'z' - 'a' + 1;
				asciiValue += 'a';
			}
			charArray[index] = (char)asciiValue;
		}
		System.out.println(String.valueOf(charArray));
	}
	
}

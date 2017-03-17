package com.yyxz.arithmetic;

import java.util.Scanner;

/**
 * 
 * @author bianxh
 * 程序实现目标：求一个整型数组中元素的平均值，并统计其中大于和小于此平均值的元素的个数。
 * 程序要求：输入：整型数组中的元素个数及各个元素。
 * 输出：整型数组中元素的平均值，大于和小于此平均值的元素的个数。
 */
public class algorithm12 {
	public static void test() {
		System.out.println("请输入数组，比如10，20，30：");
		Scanner inputScanner = new Scanner(System.in);
		String inputStr = inputScanner.nextLine();
		inputScanner.close();
		String[] inputNumberArray = inputStr.split(",");
		int sum = 0;
		for (String num : inputNumberArray) {
			sum += Integer.parseInt(num);
		}
		float averageNum = (float)sum / inputNumberArray.length;
		
		int greatThanAverageNum = 0;
		int lessThanAverageNum = 0;
		for(String numStr : inputNumberArray) {
			int num = Integer.parseInt(numStr);
			if (num > averageNum) {
				greatThanAverageNum ++;
			} else if (num < averageNum) {
				lessThanAverageNum ++;
			}
		}
		System.out.println("平均值 = " + averageNum + ", 大于平均值的有" + greatThanAverageNum
				+ "个，小于平均值的有" + lessThanAverageNum + "个。");
	}
}

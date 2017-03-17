package com.yyxz.arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author bianxh
 * 手动输入一个存储整数的数组，要求输出数组里面的2个最大值。
 * 实例:
 * 输入：1,2,5,9,84,3,2
 * 输出：84,9
 */
public class algorithm13 {
	public static void test() {
		System.out.println("请输入待检测待数组，比如（1,2,5,9,84,3,2）：");
		BufferedReader bfd = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = "";
		try {
			inputStr = bfd.readLine();
			bfd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] numStrArray = inputStr.split(",");
		int[] numValueArray = new int[numStrArray.length];
		for(int index = 0; index < numStrArray.length; index ++) {
			numValueArray[index] = Integer.parseInt(numStrArray[index]);
		}
		int[] topTwoNumber = new int[2];
		topTwoNumber[0] = numValueArray[0];
		topTwoNumber[1] = numValueArray[1];
		for(int num : numValueArray) {
			if (num > topTwoNumber[0]) {
				topTwoNumber[1] = topTwoNumber[0]; 
				topTwoNumber[0] = num;
			}
		}
		System.out.println("最大的两个数字依次是：" + topTwoNumber[0] + "," + topTwoNumber[1]);
	}
}

package com.yyxz.arithmetic;

import java.util.Scanner;

/**
 * 
 * @author bianxh
 * 手机电池余量
 * 自从有了智能手机，时刻都要关心手机的电量。此任务很简单，用程序打印符号来表示当前手机的电量。
 * 用10行和10列来表示电池的电量，同时在外围加上边框，每一行表示10%的电量。
 * 假设还有60%的电量，则显示如下：
 * +----------+
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |++++++++++|
 * |++++++++++|
 * |++++++++++|
 * |++++++++++|
 * |++++++++++|
 * |++++++++++|
 * +----------+
 * 输入:	多组测试数据，第一行为测试数据组数N（N<10），紧接着是N行，每行一个数，表示电量，这个数值可能是0，10，20，30，40，50，60，70，80，90，100
 * 输出:	每组数据输出一个电池的电量，每组数据之间用15个“=”隔开
 * 样例输入:	
 * 2
 * 50
 * 0
 * 样例输出:	
 * +----------+
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |++++++++++|
 * |++++++++++|
 * |++++++++++|
 * |++++++++++|
 * |++++++++++|
 * +----------+
 * ===============
 * +----------+
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * |----------|
 * +----------+
 * ===============
 */
public class algorithm2 {
	public static void test() {
		final String frame = "+----------+";
		final String boarder = "|";
		final String energy = "++++++++++";
		final String noEnergy = "----------";
		
		System.out.println("样例输入，比如\n2\n50\n0:\n");
		Scanner inputScanner = new Scanner(System.in);
		int inputNum = Integer.parseInt(inputScanner.nextLine());
		int[] battaryLever = new int[inputNum];
		for(int index = 0; index < inputNum; index ++) {
			battaryLever[index] = Integer.parseInt(inputScanner.nextLine());
		}
		inputScanner.close();
		
		for (int printNum = 0; printNum < inputNum; printNum ++) {
			System.out.println(frame);
			for(int index = 0; index < 10; index ++) {
				String content = "";
				if (index < 10 - (battaryLever[printNum] / 10)) {
					content = noEnergy;
				} else {
					content = energy;
				}
				System.out.println(boarder + content + boarder);
			}
			System.out.println(frame);
			System.out.println("===============");
		}
	}
}

package com.yyxz.arithmetic;

import java.util.Scanner;

/**
 * 
 * @author bianxh
 * 分苹果 
 * 小明准备把M个同样的苹果分在N个同样的篮子里，允许有的篮子空着不放，那么一共有多少种不同的分法呢？
 * 说明：3，1，1和1，3，1 是同一种分法。
 * 输入: 每个用例包含二个整数M和N。0<=M<=10，1<=N<=10。 
 * 输出: 一个整数K，表示一共有K种分苹果的方法。 
 * 样例输入: 7 3
 * 样例输出: 8
 */
public class algorithm4 {
	public static void test() {
		System.out.println("样例输入，比如\n7\n3");
		Scanner inputScanner = new Scanner(System.in);
		int M = inputScanner.nextInt();
		int N = inputScanner.nextInt();
		inputScanner.close();
		System.out.println("总共有 " + SharingApple(M, N) + " 种分法。");
	}

	/**
	 * 参考地址：http://www.th7.cn/Program/java/201407/235437.shtml 题目分析：
	 * 这道题类似于整数划分的题目，主要思路就是考递归。 1、当苹果数目或者篮子数目为1时候，就只有一种可能
	 * 2、当苹果数目小于篮子数目的时候，按照苹果数目来分配 3、当苹果数目大于篮子数目的时候，空一个盘子 + 先每个盘子放一个之后再m-n个随便放
	 * 4、当苹果数目等于篮子数目的时候，每个盘子放一个 + 空一个盘子
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int SharingApple(int m, int n) {
		if (m == 1 || n == 1) {
			return 1;
		}
		if (m < n) {
			return SharingApple(m, m);
		} else if (m > n) {
			return SharingApple(m, n - 1) // 有一个盘子没有放苹果，剩下的n-1个盘子随便放m个苹果。
					+ SharingApple(m - n, n); // 每个盘子放一个苹果，剩下的就是m-n个苹果，随便放到n个盘子里。
		} else {
			return 1 + SharingApple(m, n - 1);
		}
	}
}

/**
 * 后记，根据数学理论，还有一些公式可以实现此统计，参考网址：
 * http://blog.csdn.net/chl0000/article/details/11790567#comments
 * n个苹果放到m个盘子中的公式是（Markdown语法版）：$f_m(n)=\sum_{i=n,n-m,n-2m,...}f_{m-1}(i)$
 */
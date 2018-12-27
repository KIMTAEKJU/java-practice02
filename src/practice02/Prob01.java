package practice02;

import java.util.Scanner;

public class Prob01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] moneysCount = new int[10]; 
		int userInput = 0;
		
		System.out.print("금액: ");
		userInput = scan.nextInt();
		
		for (int i = 0; i < MONEYS.length;)
		{
			if (userInput >= MONEYS[i])
			{
				userInput -= MONEYS[i];
				moneysCount[i]++; // 각 금액의 카운트를 증가
			}
			else
				i++; // 금액이 작으면 다음금액으로 넘어갑니다
		}
		
		for (int i = 0; i < moneysCount.length; i++)
			System.out.println(MONEYS[i] + "원: " + moneysCount[i] + "개");
			
	}

}

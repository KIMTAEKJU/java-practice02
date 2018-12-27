package practice02;

import java.util.Scanner;

public class Prob03 
{

	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		//Prob03 p03 = new Prob03();
		
		String str = scan.nextLine(); // 문자열 입력
		char c[] = new char[str.length()]; // 문자열 크기만큼 배열할당
		
		for (int i = 0; i < str.length(); i++)
			c[i] = str.charAt(i);
		
		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}
	
	public static void printCharArray(char[] c)
	{
		for (int i = 0; i < c.length; i++)
			System.out.print(c[i]);
		System.out.println();
	}
	
	public static void replaceSpace(char[] c)
	{
		for (int i = 0; i < c.length; i++)
			if (c[i] == ' ')
				c[i] = ',';
	}
}

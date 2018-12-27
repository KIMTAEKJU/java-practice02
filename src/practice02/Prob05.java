package practice02;

import java.util.Scanner;

public class Prob05 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int userInput = 0;
		int cardValue = (int) (Math.random() * 100) + 1; // 카드 랜덤값
		int minValue = 1;
		int maxValue = 100;
		int inputCount = 1;
		String yesOrNo = "";
		
		System.out.println("수를 결정하였습니다. 맞추어보세요");

		loop: while (true)
		{
			System.out.println(minValue + "-" + maxValue);
			System.out.print(inputCount + ">>");
			userInput = valueCheckInt(scan); // 올바른값인지 확인
			
			if (cardValue > userInput)
			{
				System.out.println("더 높게");
				minValue = userInput; // 최솟값에 유저가 입력한값 대입
				
				inputCount++;
			}
			
			else if(cardValue < userInput)
			{
				System.out.println("더 낮게");
				maxValue = userInput; // 최댓값에 유저가 입력한값 대입
				
				inputCount++;
			}
			
			else
			{
				System.out.println("맞았습니다");
				System.out.print("다시하시겠습니까(y/n)>>");
				yesOrNo = scan.next();
				
				if (yesOrNo.equals("n"))
					break loop;
				
				else if (yesOrNo.equals("y"))
				{
					inputCount = 1;
					cardValue = (int) (Math.random() * 100) + 1;
					minValue = 1;
					maxValue = 100;
					System.out.println("수를 결정하였습니다. 맞추어보세요");
				}
				else
				{
					System.out.println("다시입력하세요");
					yesOrNo = valueCheckStr(scan); // 올바른값인지 확인
				}
				
			}
		}
	}
	
	public static int valueCheckInt(Scanner scan) // 숫자범위에 맞는숫자가 나올때까지 반복
	{
		int userInput = 0;
		
		while (true)
		{
			userInput = scan.nextInt();
			
			if (userInput < 0 || userInput > 100)
				System.out.println("다시입력하세요");
			else
				break;
		}
		
		return userInput;
	}
	
	public static String valueCheckStr(Scanner scan) // y or n가 나올때까지 반복
	{
		String userInput = "";
		
		while (true)
		{
			userInput = scan.next();
			
			if (userInput != "y" || userInput != "n")
				System.out.println("다시입력하세요");
			else
				break;
		}
		
		return userInput;
	}

}

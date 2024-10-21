package programs;

import java.util.Scanner;

public class SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		swapWithoutThirdVariable(num1, num2);
	
	}
	
	public static void swapWithoutThirdVariable(int firstNumber, int secondNumber)
	{
		System.out.println("Numbers you have entered are "+firstNumber +secondNumber);
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("Number after swapping are " +firstNumber +secondNumber); 
	}
}

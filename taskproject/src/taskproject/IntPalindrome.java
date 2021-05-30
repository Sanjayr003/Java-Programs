package taskproject;

import java.util.Scanner;

public class IntPalindrome {

	public static void main(String[] args) {
		int number,temp,reminder,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		number=sc.nextInt();
		temp=number;
		while(number>0)
		{
			reminder=number%10;
			sum=(sum*10)+reminder;
			number=number/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}

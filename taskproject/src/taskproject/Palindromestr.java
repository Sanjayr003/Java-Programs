package taskproject;

import java.util.Scanner;

public class Palindromestr {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.next();
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);	
	}
	System.out.println("Reversed String\n"+rev);
	if(str.equals(rev))
	{
		System.out.println("Entered is Palindrome");
		
	}
	else
	{
		System.out.println("Not a Palindrome");
	}

	}

}

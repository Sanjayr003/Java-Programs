package taskproject;

import java.util.Scanner;

public class TempSwap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String1");
		String str1=sc.next();
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter a String2");	
		String str2=ac.next();
		System.out.println("Entered Strings "+str1+" and "+str2);
		String temp;
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println("After Swapping "+str1+" and "+str2);

	}

}

package taskproject;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		//int a,b;
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		str1=sc.next();
		//a=sc.nextInt();
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter String 2");
		str2=ac.next();
		//b=ac.nextInt();
		System.out.println("Before Swapping "+str1+" and "+str2);
		//System.out.println("Before Swapping "+a+" and "+b);
		str1=str1+str2;
		//a=a+b;
		//b=a-b;
		//a=a-b;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After Swapping "+str1+" and "+str2);

	}

}

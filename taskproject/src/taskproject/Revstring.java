package taskproject;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) {
		System.out.println("Enter String");
		String str=" ";
		String rev=" ";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int i=str.length()-1; i>=0; i--)
			rev=rev+str.charAt(i);
			System.out.println("Reversed String "+rev);
	}

}

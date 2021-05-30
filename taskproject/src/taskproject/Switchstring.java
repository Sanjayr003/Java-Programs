package taskproject;

import java.util.Scanner;

public class Switchstring {

	public static void main(String[] args) {
		System.out.println("Enter String");
		
		Scanner sc=new Scanner(System.in);
			String str;
			str=sc.next();
		
		switch(str)
		{
		case "sanju":
			System.out.println("Coimbatore");
			break;
		case "azar":
			System.out.println("Chennai");
			break;
		case "balu":
			System.out.println("Banglore");
			break;
			default:
				System.out.println("Invalid");
		}

	}

}

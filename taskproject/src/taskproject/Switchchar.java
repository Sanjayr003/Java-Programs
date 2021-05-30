package taskproject;

import java.util.Scanner;
public class Switchchar {

	public static void main(String[] args) {
		System.out.println("Enter char");
		
	Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);
	
	switch(ch)
	{
	case 'a':
		System.out.println("First case");
		break;
	case 'b':
		System.out.println("Second case");
		break;
		default:
			System.out.println("Invalid");
	}
		

	}

}

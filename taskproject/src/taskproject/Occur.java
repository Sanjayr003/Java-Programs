package taskproject;

import java.util.Scanner;

public class Occur {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter String");
		Scanner a=new Scanner(System.in);
		str=a.next();
		System.out.println("Enter Character to be search");
		char ch=(char)System.in.read();
		//Scanner ch=new Scanner(System.in);
		//str2=ch.next();
		int numberofoccurance=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			//if(String.valueOf(c)==str2)
			if(c==ch)
			{
				numberofoccurance++;
			}
		}
		System.out.println("Occurances"+numberofoccurance);
	}

}

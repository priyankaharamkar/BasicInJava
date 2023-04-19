package org.tech;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,rem;
		boolean flag=false;
		System.out.println("enter the number");
		no=sc.nextInt();
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			if(rem==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("duck number");
		}
		else {
			System.out.println("not duck number");
		}

	}

}

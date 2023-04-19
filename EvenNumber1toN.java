package org.tech;
import java.util.*;
public class EvenNumber1toN {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int no,i;
	System.out.println("enter the number:");
	no=sc.nextInt();
	System.out.println("Even Number is :");
	for(i=1;i<=no;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}

	}

}

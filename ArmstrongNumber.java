package org.tech;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int no,temp,rem,sum=0;
	System.out.println("enter the number");
	no=sc.nextInt();
	temp=no;
	while(temp!=0)
	{
		rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
	if(sum==no)
	{
		System.out.println("Armstrong");
	}
	else {
		System.out.println("not Armstrong");
	}

	}

}

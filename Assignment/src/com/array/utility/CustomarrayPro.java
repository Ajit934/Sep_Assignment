package com.array.utility;

public class CustomarrayPro
{
public static int myarryalength(Object [] a)
{
	int count=0;
	for(Object obj:a)
	{
		count++;
	}
	return count;
}

public static void main(String[] args) {
	
	Object[] a = { "a","abc" };
	System.out.println(myarryalength(a));
}
}

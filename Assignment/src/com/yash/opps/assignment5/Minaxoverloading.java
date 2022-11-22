package com.yash.opps.assignment5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Minaxoverloading 
{
public void m1(String ar[])
   {

int max=0;
int ind=0;
for(int i=0;i<ar.length;i++)
{
	if(ar[i].length()>max)
	{
	max=ar[i].length();
	ind=i;
	}
}

System.out.println("max length string is ="+ ar[ind]);
}
 
public void m1(int ar[])
{

int max=0;


	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>max)
		{
			max=ar[i];
		}
	}
	System.out.println("max no is =" +max);
	
}


public static void main(String[] args) 
{
	int ar[]= {10,30,29,57,47,34};
	String ar2[]= {"aa","bbaa","shsjf","shhhsss","a"};
	Minaxoverloading m=new Minaxoverloading();
	m.m1(ar2);
}

}

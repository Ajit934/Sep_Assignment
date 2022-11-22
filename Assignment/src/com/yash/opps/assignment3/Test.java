package com.yash.opps.assignment3;

import java.util.Scanner;

import com.yash.opps.assignment2.Triangle;

public class Test
{
public static void main(String[] args) 
{
	
Scanner sc=new Scanner(System.in);
System.out.println("enter side 1" );
int side1=sc.nextInt();
System.out.println("enter side 2");
int side2=sc.nextInt();

if(side1==side2)
{
Twosides t2=new Twosides();
t2.area(side1,side2);
}

System.out.println("enter side 3");

int side3=sc.nextInt();
Threesides ts=new Threesides();
ts.area(side1, side2, side3);

Areaoftriangle at=new Areaoftriangle();
at.area(side1, side2, side3);
if(side1+side2+side3==180)
{
	System.out.println("Given three sides are belong to right angle triangle ");
}
else
{
	System.out.println("given three sides are not belong to right angle triangle ");
	}
}
}

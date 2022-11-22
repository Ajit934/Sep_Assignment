package com.yash.opps.assignment2;

import java.util.Scanner;

public class Test
{
public static void main(String[] args) 
{
	Shape shape;
	
Scanner sc=new Scanner(System.in);
System.out.println("Find area press 1. circle" );
System.out.println("                2. Sphere" );
System.out.println("                3. Triangle");
int choice=sc.nextInt();
switch (choice) 
{
case 1:
	shape=new Circle();
	System.out.println("enter radies of circle");
	int cradies=sc.nextInt();
	
	double area=shape.area(cradies);
	System.out.println("Area of Circle ="+area);
	
	break;

case 2:
	shape=new Sphere();
	System.out.println("enter radies of Sphere");
	int sradies=sc.nextInt();
	
	double area1=shape.area(sradies);
	System.out.println("Area of Sphere ="+area1);
	
	break;

case 3:
	shape=new Triangle();
	System.out.println("enter Base of Triangle");
	int base=sc.nextInt();
	double area2=shape.area(base);
	System.out.println("Area of Triangle ="+area2);
	break;

default:
	System.out.println("invalid input");
	break;
}

}
}

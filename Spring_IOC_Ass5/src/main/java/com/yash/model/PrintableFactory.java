package com.yash.model;

public class PrintableFactory
{
	public static Employee getEmployee()
	{
		return new Clerk();
	}
}

package com.yash.assignment.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.yash.string.utility.Customcharatmethoed;
import com.yash.string.utility.Customstringlength;
import com.yash.string.utility.Customstringlowercase;

public class Task4sumofdigit 
{
	
public static void main(String[] args) 
{
	Map<Character,Integer> mymap=new HashMap<Character,Integer>();
	//add values Inside map according to Number and char
	char ch='a';
	for(int i=1;i<=26;i++)
	{
		mymap.put(ch, i);
		ch++;
	}
	
	//System.out.println(mymap);
	
	//Accepting the string from user
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the inputstring1" + " (must enter character only)"  );
	String inputstring=Customstringlowercase.stringLowerCase(sc.nextLine());
	
	System.out.println(inputstring);
	//logic for the addition
	int sum=0;
	for(int i=0;i<Customstringlength.myStringLength(inputstring);i++)
	{
		char chr=Customcharatmethoed.myCharAt(i, inputstring);
		
		sum+=mymap.get(chr);
	}
	
	System.out.println("sum of string char is ="+sum);
	
	}
	

}

	
	



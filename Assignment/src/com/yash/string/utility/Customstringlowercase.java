package com.yash.string.utility;

public class Customstringlowercase 
{

	
	public  static String stringLowerCase(String s)
	{
		String output="";
		for(int i=0;i<Customstringlength.myStringLength(s);i++)
		{
		char ch=s.charAt(i);
		
		if(ch<=90 && ch>=65)
		{
			char ch1=(char) (ch+32);
			output+=ch1;
		}
		
		else {
			output+=ch;
		}
		
		}
		
		return output;
	
	}
	
	public static void main(String[] args)
	{
		System.out.println(stringLowerCase("ABC34abc"));
	}
	
	
}

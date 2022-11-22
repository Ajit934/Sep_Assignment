package com.yash.assignment.string;

import com.yash.string.utility.Customcharatmethoed;
import com.yash.string.utility.Customstringlength;

public class Task6splitfunction
{
public static void main(String[] args) 
{
String s="split string without using inbuit function";


//finding how much spaces
int size=0;
for(int i=0;i<Customstringlength.myStringLength(s);i++)
{
	char ch=Customcharatmethoed.myCharAt(i, s);
	if(ch==' ')	
	{
		size++;
	}
	
}

String arr[]=new String[size];

String input="";
int ind=0;
int len=Customstringlength.myStringLength(s);

for(int i=0;i<len;i++)
{
	char ch=Customcharatmethoed.myCharAt(i, s);
	if(ch!=' ' || len==i)	
	{
		input+=ch;
	}
	else
	{
		
		arr[ind]=input;
		ind++;	
		input="";
	}
}

for(String val:arr)
{
	System.out.println(val);
}

}
}

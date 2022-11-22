package com.yash.opps.assignment6;

import java.util.Scanner;

public class Child  extends Parent
{

	public void comprestring(String s1,String s2)
	{
		
		int i,flag=1,len1,len2;
	
	
	len1=s1.length();
	len2=s2.length();

	char str1[] = s1.toCharArray();
	char str2[] = s2.toCharArray();

	    	if(len1==len2)
		{	
			for(i=0;i<len1;i++)
			{
    			if(str1[i]!=str2[i])
    			{
        				flag=0;
                		break;
			}
    		}
	}
	 	else
		{
			flag=0; 
		}	
    	if(flag==1)
		{
	        	System.out.println("The two string are EQUAL!!!");
    		System.out.println(s1+" = "+s2);
		}

		else
		{
	        	System.out.println("The two string are NOT EQUAL!!!");
    		System.out.println(s1+" != "+s2);
		}
			}

}

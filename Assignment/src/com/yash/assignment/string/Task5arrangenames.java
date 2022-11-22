package com.yash.assignment.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task5arrangenames 
{
public static void main(String[] args) 
{

	List<String> l=new ArrayList<String>();
	
String s[]= {"abc","ab","abcde","a"};

	 for(int i=0; i<s.length; i++)
	    { 
	l.add(s[i]);  
	    }
	
	 Collections.sort(l);
	 
	 System.out.println(l);
}
}

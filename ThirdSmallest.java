package com.yash.assignment.array;

import com.array.utility.CustomarrayPro;

public class ThirdSmallest 
{
public static void main(String[] args) 
{
int arr[]= {10,20,78,34,25,89,80};

int temp;

for (int i = 0; i < arr.length; i++) 
{
   for (int j = i + 1; j < arr.length; j++) 
   {
      if (arr[i] > arr[j]) 
      {
         temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
      }
   }
}
System.out.println("Third smallest ="+arr[2]);

}
}

package com.yash.opps.assignment1;

public class Test 
{
public static void main(String[] args) 
{
	//Calories, Carbohydrate, Fiber, Sugar, Fat, Protein, vitamins 
	String sourfruit[]= {"10%cal","40%carb","20%fib" ,"10%sug", "5%fat" ,"5%protein" ,"10%vit"};
	String sweetfruit[]= {"10%cal","10%carb","20%fib" ,"40%sug", "5%fat" ,"5%protein" ,"10%vit"};
	
	SourFruits sof=new SourFruits("Mango", "yellow", sourfruit, "10%sug");

	Sweetfruits swf=new Sweetfruits("Apple", "Green", sweetfruit, "40%sug");
	
	sof.display(sof);
	swf.display(swf);
	
	
}
}

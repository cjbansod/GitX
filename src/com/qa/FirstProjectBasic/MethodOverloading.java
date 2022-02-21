package com.qa.FirstProjectBasic;

public  class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MethodOverloading m =new MethodOverloading();
		//m.sum();
		//m.sum(5);
		//m.sum(10,5);
		
		
		
	}
	
	
	public  void sum() 
	{
		System.out.println("Method 1");
	}
	
	public  float sum(int i) 
	{
		return i;
		
	}
	
	 public float  sum(float i) 
	{
		System.out.println("Method 3:" +i);
		return i;
	}
	
	
	public  float sum(int i,int j) 
	{
		System.out.println("Method 4:" +(i+j));
		return i+j;
	}
	
	
	

}

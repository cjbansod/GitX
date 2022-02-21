package com.qa.FirstProjectBasic;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(2+1);
		byte b=  (byte) 129;
		System.out.println(b);

		//arrays
		String words[]=new String[3];
		words[0]="My";
		words[1]="My1";
		words[2]="My2";
		System.out.println(words[2]);

		words= new String[3];
		System.out.println(words[0]);
		String s="abs";
		System.out.println(s.length());*/


		Variables v=new Variables();
		//	System.out.println(v.GenerateOp("abcd"));

		//	v.PrintStar(5);
		v.PrintStarReverse(5);
	}

	//Print pattern A-Bb-Ccc-Dddd
	String s1="";
    public  String GenerateOp(String s) 

	{
		for(int i=0;i<s.length();i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				if(j==0) 
				{
					s1 = s1 + Character.toUpperCase(s.charAt(i));
				}
				else 
				{
					s1 = s1 + s.charAt(i);
				}
				if(i==j && i<(s.length()-1) && j<(s.length()-1)) 
				{
					s1 = s1+"-";
				}
			}
		}

		return s1;
	}

	//Print pattern of star in reverse and forward manners
    int i,j=0;
	public void PrintStar(int n) 
	{
		for(i=0;i<=n;i++) 
		{
			for(j=0;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=n;i>0;i--) 
		{
			for(j=0;j<i;j++) 
			{
				System.out.print("*");
			}
			System.out.println("");

		}
	}
	 

	public void PrintStarReverse(int row) 
	{
		      
		//Outer loop work for rows  
		for (int i=0; i<row; i++)   
		{  
			//inner loop work for space      
			for (int j=(row-1); j>i; j--)         
			{  
				//prints space before stars      
				System.out.print(" ");   
			}   
			//inner loop for columns and stars  
			for (int k=0; k<=i; k++ )   
			{   
				//prints star      
				System.out.print("*");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
		}   


	}

	
	
	
	 

}

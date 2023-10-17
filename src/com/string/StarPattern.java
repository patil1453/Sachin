package com.string;

 public class StarPattern
{
	 
public static void PyramidPattern(int n)
{

	for(int i=0; i<n ;i++)  // outer loop number of rows(n) {
	
	for(int j=n-i; j>1; j--)//inner loop for spaces
	{
		System.out.println("");//print space
	}
			int i = 0;
			for(int j1=0;j1<i;j1++)//inner loop for number of column
				
			{
				System.out.println("*");//print star
				
			}
			System.out.println();//ending line after each row
		} 
		
public static void main(String[] args)// driver function
{
 int n=5;
  PyramidPattern(n);
}
}


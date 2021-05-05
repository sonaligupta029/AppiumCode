package Test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Spring;

public class PrimeNumber {

	public static void main(String[] args) {
//		String str="Sonali Gupta";
//		String[] word=str.split(" ");
//		System.out.println(word[0].length()+ "   " + word[1].length());
		
		// ALL 3 digits prime number
//		int count = 0;
//		for (int x=100;x<1000;x++)
//		{
//		int flg=0;
//		for ( int i=2; i<=x/2;i++)
//			
//		{
//			if(x%i==0) {
//				flg=1;
//				//System.out.println("not prime");
//				break;
//				
//			}
//		}
//		if(flg==0)
//		{
//			count++;
//			System.out.println(x+"is prime");
//		}
//		}
//		System.out.println(count);
		
		
		//fibonaccie series
//		int a=1,b=2,c=a+b;
//		
//		for (int i=0;i<20;i++)
//		{
//			System.out.println(a +" ");
//			//System.out.println(b +" ");
//			a=b;
//			b=c;
//			c=a+b;
//		}
		
		//palindrome
//		String name="test";
//		String rev="";
//		
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			rev=rev+name.charAt(i);
//		}
//		if(name.equals(rev))
//			System.out.println("pallindrome");
//		else
//			System.out.println("not palindrome");
//		
//		
//		int[]a= {1,3,1,4,6,7,6,7};
//		int [] b;
//		
//		for(int i=0;i<a.length-1;i++)
//		{
//			for(int j=1;j<a.length-1;j++)
//			{
//			if(a[i]==a[j])
//			{
//				break;
//			}
//			System.out.println(a[i]+ " has duplicates");
//		    ;
//			
//			}}

		//defining an array of type String  
		String[] countries = {"sita", "sonali", "sri"};  
		int size = countries.length;  
		String temp;
		for(int i = 0; i<size; i++)   
		{  
		int flag=0;
		
		for (int j = 0; j<size-1-i; j++)   
		{  

		if(countries[j].compareTo(countries[j+1])>0)   
		{  
			temp = countries[j];  
			countries[j] = countries[j+1];  
			countries[j+1] = temp; 
			flag=1;
			
		}  
	
		}  if (flag==0)
			break;
		}  
		
		for(int i = 0; i<size; i++)   
		{ //prints the sorted array in ascending order  
		System.out.println(countries[i]+" ");  
		}  
	}
	}


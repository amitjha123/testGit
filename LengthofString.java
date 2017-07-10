package com.amit.linkedlist;

public class LengthofString {
	
	//Program to find length of string without using library function.
	public void findLength(String str)
	{
		char string1[]=str.toCharArray();
		int i=0;
		for(char c:string1)
			i++;
		System.out.println(i);
/*		try {
			for(int i=0; i< string1.length; i++)
			{
				System.out.println(string1[i]);
				length++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		//System.out.println("Length of the string is:" +length);
	}

	public static void main(String[] args) {
		LengthofString lengthofString=new LengthofString();
		lengthofString.findLength("Amit");
	}

}

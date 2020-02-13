package com.day10binarynumbers.app;

import java.util.Scanner;

public class BinaryNumbers 
{

	public static void main(String[] args)
	{
		// Variable Declaration
		int number = 0;
		int cont1 = 0;
		int cont2 = 0;
		// Scanner Object
		Scanner input = new Scanner(System.in);
		// The user inputs a number to be converted to Binary
		System.out.println("Input a number: ");
		number = input.nextInt();
		
		// Converting the decimal value to Binary
		char[] binaryArray = Integer.toBinaryString(number).toCharArray();
		// Printing the number in Binary
		System.out.println(binaryArray);
				// Verifying if there's 1's together 
		
		for(int i=0; i<binaryArray.length;i++)
		{
			if(binaryArray[i] == '1')
			{
				cont1++;
			}
			else {
				cont1 = 0;
			}
			
			if(cont1 > cont2)
			{
				cont2 = cont1;
			}
		}
		System.out.println("The consecutive 1's are:  "+cont2);
		System.out.println(cont1);

	}

}

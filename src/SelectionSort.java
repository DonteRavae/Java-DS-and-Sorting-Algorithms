/*
 * Written by Donte Littlejohn
 */

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Selection Sort Program!\nEnter the size of the Array.");
		int size = keyboard.nextInt();
		if(size <= 0)
		{
			System.out.println("That is an invalid size.");
			System.exit(0);
		}
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter value at index " + i);
			arr[i] = keyboard.nextInt();
		}
		
		//Selection Sort
		for(int i = 0; i < arr.length; i++)
		{
			int smallestIndex = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			
			if(smallestIndex != i)
			{
				//Swap
				int temp = arr[i];
				arr[i] = arr[smallestIndex];
				arr[smallestIndex] = temp;
			}
		}
		
		//Print values
		System.out.println("The sorted array is");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		keyboard.close();
	}

}

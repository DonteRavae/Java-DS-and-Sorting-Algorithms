import java.util.Scanner;

/*
 * Written by Donte Littlejohn
 */
public class BubbleSort {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Bubble Sort Program!\nEnter the size of the Array.");
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
		
		//Bubble Sort
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < arr.length - 1; i++)
			{
				if(arr[i] > arr[i + 1])
				{
					//Swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					hasSwapped = true;
				}
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

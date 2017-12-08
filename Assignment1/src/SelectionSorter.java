import java.util.Arrays;

/** 
 * SelectionSorter class implements the Sorter interface.
 * @author ponbarry
 */
public class SelectionSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public SelectionSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the selection sort algorithm to modifies the passed-in 
	 * array so that its elements are in ascending, sorted order.
	 * Prints out the current state of array for each iteration (each 
	 * time the index marking the "sorted" section of the array is updated).
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		// NEEDS TO BE IMPLEMENTED

		/*
		declare and initialize counter for the number of steps
		declare min as a variable to store the minimum number
		declare and initialize minindex as the index of the minimum number
		*/
		int counter = 1;		
		int min;
		int minidex;

		/*
		compare the numbers within the unsorted range using two for loops 
		to find the minimum; the unsorted range keeps getting smaller as
		i increases
		*/
		
		for (int i=0; i<array.length;i++)
		{	
			min = array[i];
			minidex = i;
		
			for (int j=i; j<array.length; j++)
			{	

				if (array[j]<=min)
				{	
					minidex = j;
					min = array[j];
				}
				
		
			}
		/*
		the slot contaning minimum number and the slot at i
		are swapped
		*/
		
		array[minidex] = array[i]; 
		array[i] = min;

		/*
		print out each step when i increases and the sorted list
		increases by one number
		*/
		System.out.println("        ...(Step "+counter+") " + Arrays.toString(array));
		
		/*
		increase the order number of step
		*/	
		counter++;
			
			
		}
	}

	



}

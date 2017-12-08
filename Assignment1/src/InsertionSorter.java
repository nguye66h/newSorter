import java.util.Arrays;

/** 
 * InsertionSorter class implements the Sorter interface.
 * @author ponbarry
 */
public class InsertionSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public InsertionSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the insertion sort algorithm to modify the passed-in array
	 * so that its elements are in ascending, sorted order.
	 * Prints out the current state of array for each iteration (each 
	 * time the index marking the "sorted" section of the array is updated). 
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		/*
		declare temp to hold temprary value for swapped slots
		declare count for the number of steps; initialize count as 1
		*/
		int temp;
		int count = 1;
		/*
		compare each number (stored in temp) with number
		in slot just before it until the first slot 
		If the value is bigger than temp, move the value one slot up
		put temp value into the j slot
		*/
		for (int i = 1; i < array.length; i++)
		{
			temp = array[i];
			for (int j = i - 1; j >= 0; j--)
			{
				if (array[j] > temp)
				{	
					
					array[j+1] = array[j];
					array[j] = temp;
				
				}
				
			}
			
		/*
		Print out each step as i increases
		*/

			System.out.println("        ...(step "+ count+"): "+ Arrays.toString(array));
					count++;
		}
		
		// NEEDS TO BE IMPLEMENTED	
	}
	
	

}

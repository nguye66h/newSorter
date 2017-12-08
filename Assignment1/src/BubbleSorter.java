import java.util.Arrays;

/** 
 * BubbleSorter class implements the Sorter interface.
 * @author ponbarry
 */
public class BubbleSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public BubbleSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the bubble sort algorithm to modify the passed-in array
	 * so that its elements are in ascending, sorted order.
	 * Prints out the current state of array each time any two 
	 * elements swap places. 
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		/*
		
		*/
		int temp;
		

		/*
		make the array go through array.length -1 passes
		to make sure it will give a correct order
		*/
		for (int j = 0; j < array.length - 1; j++)
		{
		/*
		go through all slots except for the last one and compare
		the slot with the slot right next to it to the right
		*/
		for (int i = 0; i < array.length - 1 - j; i++)
		{
			if (array[i] > array[i+1])
			{	
				/*
				swap two adjacent slots
				*/
				temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
				/*
				print out every time there is a swap
				*/
				System.out.println("        ...(step ): "+ Arrays.toString(array));
			}

			
		}
		}

		// NEEDS TO BE IMPLEMENTED
		
	}
	
	


}

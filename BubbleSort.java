//U10416004 顏仲賢
import java.util.*;
 
public class BubbleSort {
	//main method
	public static void main(String []args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
 
		// ask how many number they want to do the bubble sort
		System.out.print("Input number of integers to sort: ");
		int i = input.nextInt();
 
		// judge this array's length
		int array[] = new int[i];
		
		// enter the number
		System.out.println("Enter " + i + " integers you want to do the bubble sort:");
 
		// put the number into the array
		for (int j = 0; j < i; j++) {
			array[j] = input.nextInt();
		}
		//change the quene of number
		for (int j = 0; j < ( i - 1 ); j++) {
			for (int k = 0; k < i - j - 1; k++) {
				if (array[k] > array[k + 1]) {
					int swap = array[k];
					array[k] = array[k + 1];
					array[k + 1] = swap;
				}
			}
		}
 
		
		//print the answer
		System.out.println("the answer of bubble sort is");
 
		
		for (int j = 0; j < i; j++) 
			System.out.println(array[j]);
	}
}

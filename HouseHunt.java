import java.io.File;  //  File class
import java.io.FileNotFoundException;
import java.util.Scanner;

/*PUT FILE OUTSIDE OF SRC FOLDER OR DRAG FILE TO PROJECT FOLDER IN ECLIPSE APP*/

public class HouseHunt {
	public static void main(String args[]) {
		int numValues, sum=0;
		try {
			File file = new File("input.txt");
			Scanner scanner = new Scanner(file);
			numValues = scanner.nextInt();	
			int[] startArr = new int[numValues];
			int[] endArr = new int[numValues];
			int total =0;
			
			 //INPUT TEXT FILE TO ARRAY
			for(int i=0; i < numValues; i++) {
				startArr[i] = scanner.nextInt();
				endArr[i] = 1;		
			}
			
			  
			for(int i=0; i <numValues;i++) {
				if(i==0) {
					if(startArr[i]>startArr[i+1])	
						endArr[i]++;
				}
				else if(i==numValues-1) {
					if(startArr[i] > startArr[i-1]) 
						endArr[i]= endArr[i-1] + 1;
				}
				else {
					if(startArr[i] > startArr[i-1] || startArr[i] > startArr[i+1]) {
						endArr[i] = endArr[i-1] + 1;
					}
					
				}
			}
			
			//PRINT
			/*System.out.println("Original Array: ");
			for(int i=0; i <numValues;i++) {
				System.out.print(startArr[i] + " ");
			}
			
			System.out.println("\nNew Array: ");
			*/
			for(int i=0; i <numValues;i++) {
				//System.out.print(endArr[i] + " ");
				total += endArr[i];
			}
			System.out.print("\nSum: " + total);
		}
		
			
			
		 catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
	}
}
//version 1.0

import java.io.File;  //  File class
import java.io.FileNotFoundException;
import java.util.Scanner;

/*PUT FILE OUTSIDE OF SRC FOLDER OR DRAG FILE TO PROJECT FOLDER IN ECLIPSE APP*/

public class Project2 {
	public static void main(String args[]) {
		int numValues, sum=0;
		try {
			File file = new File("input.txt");
			Scanner scanner = new Scanner(file);
			numValues = scanner.nextInt();	
			int[] startArr = new int[numValues];
			int[] endArr = new int[numValues];
			
			 //INPUT TEXT FILE TO ARRAY
			for(int i=0; i < numValues; i++) {
					startArr[i] = scanner.nextInt();
			}
			
			for(int i=0; i<numValues;i++) {
				endArr[i] = startArr[i];
				if(startArr[i]==0) endArr[i]=1;
				
			}
			
			/*
			 * ALL VALUES MUST BE AN INTEGER
			 * ALL VALUES MUST BE AT LEAST 1
			 * if rating i is higher than the rating i - 1 then value i must be higher than value i - 1
			 *if rating i is higher than rating i + 1 then value i must be greater than value i + 1
			 * */
			  
			for(int i=0; i <numValues;i++) {
				if((i-1) >= 0) {
					if(endArr[i]>endArr[i-1]) {
						endArr[i] = endArr[i-1]+1;
					}
				}
				if((i+1) != numValues) {
					if(endArr[i]>endArr[i+1]) {
						endArr[i] = endArr[i+1]+1;
					}
				}
			}
			System.out.print("N= " + numValues + "\nOriginal Array:  ");
			for(int i=0; i <numValues;i++) {
				System.out.print(startArr[i] + " ");
			}
			System.out.print("\nResult Array:  ");
			for(int i=0; i <numValues;i++) {
				System.out.print(endArr[i] + " ");
				sum += endArr[i];
			}
			System.out.println("\nSum: "+sum);
			
			
			
			
		}
		 catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
	}
}
//version 1.0
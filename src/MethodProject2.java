/**
*
* Name: Marsha Guimond
* Teacher: Mr.Hardman
* Assignment: MethodProject2
* Date Last Modified: December 8, 2016
*
*/
import java.util.Scanner;

/**
 * @author m.guimond3
 *
 */
public class MethodProject2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in); 
			 
		double[] student1 = {56.2, 65.7, 45.32, 89.213, 65, 76, 54, 98, 45, 87.2}; 
		
		double[] student2 = new double[10]; 
		 
		double average1; 
		double average2; 
	 
	 		 
		System.out.println("Please enter ten marks to be averaged:");  
		for (int i = 0; i < student2.length; i++){
			System.out.print("Please enter a mark: ");
			student2[i] = userInput.nextDouble();
		}
			
				 
		average1 = calcAverage(student1); 
		average2 = calcAverage(student2); 
		
		System.out.println("Your average is " + average2 + ".");
		 		 
		if(average2 > average1){ 
		 			 
			System.out.println("Your average is greater than student 1's by " + (average2 - average1) + " points."); 
		 			 
		} else if(average2 < average1){ 
		 			 
		 	System.out.println("Your average is less than student 1's by " + (average1 - average2) + " points."); 
		 			 
	 	} else { 
					 
		 	System.out.println("Your average is equal to student 1's."); 
		 			 
		} 
				 
		userInput.close();		 
		 
		 
	}

	
	/**
	 * calcAverage will calculate the users average
	 *
	 * @param the users marks will be stored
	 * @return the users marks compared to the first users marks will
	 * be returned
	 */
 	public static double calcAverage( double[] marks ){
 		
 		double sum = 0;
 		double average = 0;
 		
 		for(int i = 0; i < marks.length; i++){
			sum += marks[i];
 		
 		}
 		
 		average = sum / marks.length;
 		return average;
 
 	}

 	
}

 		
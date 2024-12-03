/*/Landon Barden's Work/*/
import java.util.Scanner;

public class RectangleSorter {
	public static int totalRectangle;
	public static Rectangle recMatrix[];
	public static Scanner k = new Scanner(System.in);
	
	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		print("Welcome to the Rectangle Sorter! To begin, please type the number of rectangles you want to sort.");

		boolean validity = false;
		while(validity == false) {
			totalRectangle = k.nextInt();
			
			if(totalRectangle <= 0) { //Checks if array is empty
				print("Array cannot be empty. Please try again.");
			}
			else { //Allows program to continue if array is not less than or equal to 0
				validity = true;
			}
		}
		
		Rectangle recMatrix[] = new Rectangle[totalRectangle];
				
		for(int i = 0; i < totalRectangle; i++) {
			print("Now, type in the length and width for rectangle "+(i+1)+"\nFirst, type the length.");
			double l = k.nextDouble();
			print("Now, type the width");
			double w = k.nextDouble();
			recMatrix[i] = new Rectangle(l, w);
		}
		
		//Now that the Rectangles are input, it loops this statement until the program is quit
		while(0<=1) {
			print("Please select what function you would like to perform by typing in the corresponding number."
					+ "\n0--Quit\n1--Sort Area(Largest to Smallest)\n2--Sort Area(Smallest to Largest)"
					+ "\n3--Display Average Area\n4--Display Maximum Area\n5--Display Minimum Area"
					+ "\n6--Print Rectangle Values");
		
			int numSelect = k.nextInt();
			
			if(numSelect == 0) {
				//Quit program
				print("Program terminated.");
				System.exit(0);
			}
			else if(numSelect == 1) {
				//Sort Area from Largest to Smallest
				for(int i = 1; i < recMatrix.length; i++) {
					for(int j = 0; j < recMatrix.length; j++) {
						if(recMatrix[i].getArea() > recMatrix[j].getArea()) {
							Rectangle holder = recMatrix[j];
							recMatrix[j] = recMatrix[i];
							recMatrix[i] = holder;
						}
					}
				}
				/*The above for-loops check if the second array value is less than the
				 * first, and then swaps the two values if they are.
				 * */
				
				for(int i = 0; i < recMatrix.length; i++) {
					print("\nRectangle "+(i+1));
					print(recMatrix[i].toAreaString());
				}
			}
			else if(numSelect == 2) {
				//Sort Area from Smallest to Largest
				for(int i = 1; i < recMatrix.length; i++) {
					for(int j = 0; j < recMatrix.length; j++) {
						if(recMatrix[i].getArea() < recMatrix[j].getArea()) {
							Rectangle holder = recMatrix[i];
							recMatrix[i] = recMatrix[j];
							recMatrix[j] = holder;
						}
					}
				}
				
				for(int i = 0; i < recMatrix.length; i++) {
					print("\nRectangle "+(i+1));
					print(recMatrix[i].toAreaString());
				}
			}
			else if(numSelect == 3) {
				//Display Average Area
				double avgArea = 0;
				for(int i = 0; i < recMatrix.length; i++) {
					avgArea += recMatrix[i].getArea();
				}
				avgArea /= totalRectangle;
				System.out.println("\nThe average area is "+avgArea);
			}
			else if(numSelect == 4) {
				//Display Max Area
				double maxArea = 0;
				String maxAreaRect = ("Rectangle");
				for(int i = 0; i < recMatrix.length; i++) {
					if(recMatrix[i].getArea() >= maxArea) {
						maxAreaRect = ("Rectangle "+ (i+1));
						maxArea = recMatrix[i].getArea();
					}
				}
				System.out.println("\nThe rectangle with the maximum area is "+maxAreaRect+" with an area of "+maxArea);
			}
			else if(numSelect == 5) {
				//Display Minimum Area
				double minArea = recMatrix[0].getArea();
				String minAreaRect = ("Rectangle");
				
				for(int i = 0; i < recMatrix.length; i++) {
					if(recMatrix[i].getArea() <= minArea) {
						minAreaRect = ("Rectangle "+ (i+1));
						minArea = recMatrix[i].getArea();
					}
				}
				System.out.println("\nThe rectangle with the minimum area is "+minAreaRect+" with an area of "+minArea);
			}
			else if(numSelect == 6) {
				//Display Rectangle Values
				for(int i = 0; i < recMatrix.length; i++) {
					print("\nRectangle "+(i+1));
					print(recMatrix[i].toString());
				}
			}
			else {
				print("Invalid number typed. Try again.");
			}
			
			print("");
			// While statement loops back to top here
		}
	}
}

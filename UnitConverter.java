//Importing the scanner
import java.util.Scanner;

public class UnitConverter{
	//Main
	public static void main(String [] args){
		mainMenu();
	}
	
	public static void mainMenu(){
		boolean loopMenu = true;
	    
		while(true){
		//Main Menu
		System.out.println("Please select an option!");
		System.out.println("<------------------------->\n");
		System.out.println("1. Convert Volume");
		System.out.println("2. Covert Distance");
		System.out.println("3. Quit");
		System.out.println();
		System.out.println("<------------------------->\n");
		System.out.println("Put your choice down here: ");
		menuChoice();	
		}
	}
	
	public static void menuChoice(){
		//Scanner object
		Scanner s = new Scanner(System.in);
		
		//Receiving the user's choice
		int option = s.nextInt();

		//Switch case to cycle through the different user choices
		switch(option){
			case 1:
			//Convert Volume
			volumeMenuChoice();
			break;
			
			case 2:
			//Convert Distance
			distanceMenuChoice();
			break;
			
			case 3:
			System.out.println("Exiting Now...!");
			System.exit(0);
			//Quit
			break;
			
			default:
			//Invalid Input!
			System.out.println("Invalid Input, Try Again!");
			break;
		}
	}
	
	public static void volumeMenuChoice(){
		Scanner sc = new Scanner(System.in);
		
		boolean loopVolumeMenu = true;
			//Volume Menu
			while(true){
			System.out.println("What do you want to convert?");
			System.out.println("<------------------------->\n");
			System.out.println("1. Teaspoons to Tablespoons");
			System.out.println("2. Teaspoons to Cups");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Return to Main Menu");
			System.out.println();
			System.out.println("<------------------------->\n");
			System.out.println("Put your choice down here: ");
			
			int volumeOption = sc.nextInt();
			
			switch(volumeOption){
				case 1: 
				System.out.println("Enter the number of Teaspoons that you want to convert: ");
				int tsp = sc.nextInt();
				int tbsp = tsp / 3;
				System.out.println(tbsp + " tbsp");
				break;
				
				case 2:
				System.out.println("Enter the number of Cups that you want to convert: ");
				int cups = sc.nextInt();
				int tsp2 = cups * 48;
				System.out.println(tsp2 + " tsp");
				break;
				
				case 3:
				//Convert US Gallons to Imperial Gallons
				System.out.println("Enter the number of Imperial Gallons to convert: ");
				double usgal = sc.nextDouble();
				double imgal = usgal * 0.8;
				System.out.println(imgal + " Imperial gal");
				break;
				
				case 4:
				System.out.println("Returning to Main Menu...!");
				mainMenu();
				break;
				
				default:
				System.out.println("Invalid Input, Try Again!");
				break;
			}
			}		
	}
	
	public static void distanceMenuChoice(){
		Scanner scan = new Scanner(System.in);
		
		boolean loopDistanceMenu = true;
			//Distance Menu
			while(true){
			System.out.println("What do you want to convert?");
			System.out.println("<------------------------->\n");
			System.out.println("1. Feet to Meters");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. Return to Main Menu");
			System.out.println();
			System.out.println("<------------------------->\n");
			System.out.println("Put your choice down here: ");
			
			int distanceOption = scan.nextInt();
			
			switch(distanceOption){
				case 1:
				System.out.println("Enter the number of Feet that you want to convert: ");
				double ft = scan.nextDouble();
				double m = ft / 3.3;
				System.out.println(m + " m");
				break;
				
				case 2:
				System.out.println("Enter the number of Miles that you want to convert: ");
				double mi = scan.nextDouble();
				double km = mi * 1.6;
				System.out.println(km + " km");
				break;
				
				case 3:
				System.out.println("Returning to Main Menu...!");
				mainMenu();
				break;
				
				default:
				System.out.println("Invalid Input, Try Again!");
				break;
			}
			}
	}
}

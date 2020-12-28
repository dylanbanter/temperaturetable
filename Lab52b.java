package lab5b;
import java.util.Scanner;
public class Lab52b {
	public static void menu() {
		System.out.println("1. Convert to Kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program\n.");
	}
	public static void displaykilometers(double meters) {
		double kilometers;
		kilometers = meters * 0.001;
		System.out.printf("%.2f meters converted to kilometers is %.2f\n", meters, kilometers);
	}
	public static void displayinches(double meters) {
		double inches;
		inches = meters * 39.37;
		System.out.printf("%.2f meters converted to inches is %.1f\n", meters, inches);
	}
	public static void displayfeet(double meters) {
		double feet;
		feet = meters * 3.281;
		System.out.printf("%.2f meters converted to feet is %.1f\n", meters, feet);
	}
	public static void displayerror(String error) {
		System.out.println("Error: Please enter a valid option");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			double meters;
			int base = 4;
			int choice;
			
			System.out.println("Please enter the distance in meters: ");
			meters = in.nextDouble();
			
			while(meters < 0) {
				System.out.println("Error: Please enter a positive number: ");
				meters = in.nextDouble();
			}
			
			menu();
			
			System.out.println("Enter your choice: ");
			choice = in.nextInt();
			
			while(choice != base) {
				if(choice == 1) {
					displaykilometers(meters);
				}else if(choice == 2) {
					displayinches(meters);
				}else if(choice == 3) {
					displayfeet(meters);
				}else {
					displayerror("Error: Please enter a valid optionxd");
				}
				menu();
				System.out.println("Enter your choice: ");
				choice = in.nextInt();
			}
			System.out.println("Bye!");

	}

}

package Temperature;

public class temptable {

	public static double celsius(double fahrenheit) {
		double celsius;
		celsius = ((double)5/9)*(fahrenheit - 32);
		return celsius;
	}
	public static void header() {
		System.out.println("Fahrenheit Temperature\t\t Value in Celsius\n----------------------------------------------------\t\t\t\t");
	}
	public static void main(String [] args ) {
		header();
		double celsiusvalue;
		for(double currentfahrenheit = 0; currentfahrenheit <= 20; currentfahrenheit++) {
			celsiusvalue = celsius(currentfahrenheit);
			System.out.printf("%.1f\t\t\t\t%.2f\n",currentfahrenheit, celsiusvalue);
			
		}
	}
		
}

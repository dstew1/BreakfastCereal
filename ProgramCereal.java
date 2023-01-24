/* Author Name: Daniel Stewart
 * Description: This class uses the BreakfastCereal class along with user input to calculate the total
 * fibre amount in the users Cereal
 */
import java.util.Scanner;

//class for calculating total fibre amount
public class ProgramCereal {

	//entry point for program
	public static void main(String[] args) {
		//declarations
		Scanner keyboard = new Scanner(System.in);
		double userInput;
		double fibre;
		double measure;
		String report;
		double totalFibre;
		String shouldContinue = "Y";
		BreakfastCereal Cereal = new BreakfastCereal();
		
		while(shouldContinue.equalsIgnoreCase("Y")) {
		
		//acquire measure value
		System.out.println("Enter measure (grams): ");
		measure = keyboard.nextDouble();
		keyboard.nextLine();
		Cereal.setMeasure(measure);
		
		//acquire fibre value
		System.out.println("Enter fibre per gram (grams): ");
		fibre = keyboard.nextDouble();
		keyboard.nextLine();
		Cereal.setFibre(fibre);
		
		//call methods 
		totalFibre = Cereal.calculateTotalFibre();
		report = Cereal.checkTotalFibre();
		
		System.out.println(report);
		//allows user to choos to continue or exit program
		System.out.println("Continue? Y/N: ");
		shouldContinue = keyboard.next();
		
	}
		System.out.println("Program by Daniel Stewart");
    }
}
	

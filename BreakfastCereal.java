/*
 * Author/modified by: Daniel Stewart
 * Description: This class creates methods that will be used in the ProgramCereal class to calculate
 * the total fibre content in the users cereal
 */

/*
 * this class represents a BreakfastCereal
 */

public class BreakfastCereal {
	private static double measure;  // in grams, per serving
	private static double fibre;    // in grams, per serving
	
	/*
	 * no argument constructor, sets fields to zero
	 */
	public BreakfastCereal() {
		this(0.0,0.0);
	}
	
	/*
	 * argument constructor
	 */
	public BreakfastCereal(double measure, double fibre) {
			this.measure = measure;
			this.fibre = fibre;
	}
	
	/*
	 * accessor for measure
	 */
	public double getMeasure() {
		return measure;
	}
	
	/*
	 * mutator for measure 
	 */
	public void setMeasure(double measure) {
		this.measure = measure;
	}
	
	/*
	 * accessor for fibre
	 */
	public double getFibre() {
		return fibre;
	}
	
	/*
	 * mutator for fibre 
	 */
	public void setFibre(double fibre) {
		this.fibre = fibre;
	}
	
	/*
	 * This worker method calculates the total fibre in a measure
	 * of breakfast cereal
	 * using the measure and fibre fields.
	 */
	public static double calculateTotalFibre() {
		double totalFibre = measure * fibre;
		return totalFibre;
	}

	/*
	 * Method checks if total fibre content is within a certain range
	 */
	public String checkTotalFibre(){
		String report;
		if(BreakfastCereal.calculateTotalFibre() >= 0 && BreakfastCereal.calculateTotalFibre() <= 333) {
			report = String.format("checkTotalFibre reports: total fibre within range");
		}
		else if(BreakfastCereal.calculateTotalFibre() < 0) {
			report = String.format("checkTotalFibre reports: total fibre invalid");
			}
		else if(BreakfastCereal.calculateTotalFibre() > 333) {
			report = String.format("checkTotalFibre reports: total fibre too high");
		}
		else {
			report = String.format("Invalid input");
		}
	   
		
		return report; // return the actual report
	}
}
package programmation;

public class ProgrammationHoraire {
	
	protected double temperature = 9.0;
	
	public ProgrammationHoraire() {
	}
		
	public double LireTemperature() {
		System.out.println("			Class ProgrammationHoraire, Methode LireTemperature \n" );
		return temperature;
	}

	public void AjoutNouvelleTemperature(double uneTemperature) {
		System.out.println("			Class ProgrammationHoraire, Methode AjoutNouvelleTemperature à " + uneTemperature + "°C \n" );
		temperature = uneTemperature;
	}
}

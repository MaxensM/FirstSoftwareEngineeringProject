package tests;

import programmation.ProgrammationChauffage;

public class testProgrammation {

	public static void main(String[] args) {

		ProgrammationChauffage laProgrammation = new ProgrammationChauffage();
		
		laProgrammation.AjoutTemperatureUnique(0, 15);
		System.out.println("\n");
		laProgrammation.AjoutNouvelleTemperature(1, 0, 11, 18.0);
		
		System.out.println("Résultat de lireTemperature "+ laProgrammation.LireTemperature(0, 0, 0) + "°C \n" );
		System.out.println("Résultat de lireTemperature "+ laProgrammation.LireTemperature(0, 5, 15) + "°C \n");
		System.out.println("Résultat de lireTemperature "+ laProgrammation.LireTemperature(1, 0, 10) + "°C \n");
		System.out.println("Résultat de lireTemperature "+ laProgrammation.LireTemperature(1, 0, 11) + "°C \n");
		System.out.println("Résultat de lireTemperature "+ laProgrammation.LireTemperature(1, 0, 12) + "°C \n");		
	}
}

package programmation;

import java.util.ArrayList;
import java.util.List;

public class ProgrammationChauffage {
	protected List<ProgrammationHebdomadaire> lesProgrammes;
	
	public ProgrammationChauffage() {
		lesProgrammes = new ArrayList<ProgrammationHebdomadaire>();
		lesProgrammes.add(new ProgrammationHebdomadaire());lesProgrammes.add(new ProgrammationHebdomadaire());
		lesProgrammes.add(new ProgrammationHebdomadaire());lesProgrammes.add(new ProgrammationHebdomadaire());
		lesProgrammes.add(new ProgrammationHebdomadaire());
	}

	public double LireTemperature(int numero, int jour, int heure) {
		System.out.println("Class ProgrammationChauffage, Methode LireTemperature avec programme: "+ numero + ", le jour " + jour + " à " + heure+ " heures" );
		return lesProgrammes.get(numero).LireTemperature(jour,heure);
	}

	public void AjoutNouvelleTemperature(int numero, int jour, int heure,double uneTemperature) {
		System.out.println("Class ProgrammationChauffage, Methode AjoutNouvelleTemperature avec programme: "+ numero + ", le jour " + jour + " à " + heure+" heures et la temperature à " + uneTemperature + "°C" );
		lesProgrammes.get(numero).AjoutNouvelleTemperature(jour, heure, uneTemperature);
	}
	
	public void AjoutTemperatureUnique(int numero, double uneTemperature) {
		System.out.println("Class ProgrammationChauffage, Methode AjoutTemperatureUnique avec programme: "+ numero + " et la temperature à " + uneTemperature + "°C" );
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 24; j++) {
				lesProgrammes.get(numero).AjoutNouvelleTemperature(i, j, uneTemperature);
			}
		} 
	}
}

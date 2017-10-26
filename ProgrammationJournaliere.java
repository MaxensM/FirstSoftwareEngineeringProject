package programmation;

import java.util.ArrayList;
import java.util.List;

public class ProgrammationJournaliere {
	
	protected List<ProgrammationHoraire> lesHeures;
	
	public ProgrammationJournaliere() {
		lesHeures = new ArrayList<ProgrammationHoraire>();
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
	}

	public double LireTemperature(int heure) {
		System.out.println("		Class ProgrammationJournaliere, Methode LireTemperature à " + heure+ " heures" );
		return lesHeures.get(heure).LireTemperature();
	}

	public void AjoutNouvelleTemperature(int heure,double uneTemperature) {
		System.out.println("		Class ProgrammationJournaliere, Methode AjoutNouvelleTemperature à " + heure+" heures et la temperature à " + uneTemperature + "°C" );
		lesHeures.get(heure).AjoutNouvelleTemperature(uneTemperature);
	}
}

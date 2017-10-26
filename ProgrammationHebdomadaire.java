package programmation;

import java.util.ArrayList;
import java.util.List;

public class ProgrammationHebdomadaire {
	
	protected List<ProgrammationJournaliere> lesJours;
	
	public ProgrammationHebdomadaire() {
		lesJours = new ArrayList<ProgrammationJournaliere>();
		lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());
		lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());
		lesJours.add(new ProgrammationJournaliere());
	}

	public double LireTemperature(int jour, int heure) {
		System.out.println("	Class ProgrammationHebdomadaire, Methode LireTemperature: le jour " + jour + " à " + heure+ " heures" );
		return lesJours.get(jour).LireTemperature(heure);
	}

	public void AjoutNouvelleTemperature(int jour, int heure,double uneTemperature) {
		System.out.println("	Class ProgrammationHebdomadaire, Methode AjoutNouvelleTemperature: le jour " + jour + " à " + heure+" heures et la temperature à " + uneTemperature + "°C" );
		lesJours.get(jour).AjoutNouvelleTemperature(heure, uneTemperature);
	}
}

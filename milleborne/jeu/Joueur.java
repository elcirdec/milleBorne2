package jeu;

import java.util.List;

import cartes.Borne;
import cartes.Carte;

public class Joueur {
	private String nom;
	private ZoneDeJeu zoneDeJeu = new ZoneDeJeu();
	MainAsListe main;
	
	public Joueur(String nom) {
		this.nom=nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void donner(Carte carte) {
		main.prendre(carte);		
	}

	public Carte prendreCarte(List<Carte> sabot) {
		if(sabot.isEmpty()) {
			return null;
		}else {
			Carte carte = sabot.get((sabot.size() - 1));
			sabot.remove(carte);
			donner(carte);
			return carte;
		}

	}

	public void deposer(Borne borne) {
		donner(borne);
	}
	
	public int donnerKmParcourus() {
		int nbKm=0;
		for(Borne borne : zoneDeJeu.getCollectionBorne()) {
			nbKm += borne.getKm();
		}
		return nbKm; 
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Joueur joueur) {
			return nom.equals(joueur.getNom());
		}
		return false;
	}
}

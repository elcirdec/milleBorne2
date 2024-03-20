package jeu;

import java.util.ArrayList;
import java.util.List;

import cartes.*;
import cartes.Probleme.Type;


public class Joueur {

	List<Limite> pileLimite = new ArrayList<>();
	List<Bataille> pileBataille = new ArrayList<>();
	List<Borne> collectionBorne = new ArrayList<>();
	List<Botte> ensembleBotte = new ArrayList<>();
	MainAsListe main; 


	public Joueur(String nom) {
		this.nomJoueur=nom;
	}


	public List<Limite> getPileLimite() {
		return pileLimite;
	}

	public List<Bataille> getPileBataille() {
		return pileBataille;
	}

	public List<Borne> getCollectionBorne() {
		return collectionBorne;
	}

	public List<Botte> getEnsembleBotte() {
		return ensembleBotte;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	private String nomJoueur;

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Joueur joueur) {
			return nomJoueur.equals(joueur.getNomJoueur());
		}
		return false;
	}

	@Override
	public String toString() {
		return nomJoueur;
	}

	public void donner(Carte carte) {
		main.prendre(carte);		
	}

	public Carte prendreCarte(List<Carte> sabot) {
		if(sabot.isEmpty()) {
			return null;
		}else {
			Carte carte = sabot.get((sabot.size() - 1);
			sabot.remove(carte);
			donner(carte);
			return carte;
		}

	}

	public int getKM() {
		int nbKm=0;
		for(Borne borne : collectionBorne) {
			nbKm += borne.getKm();
		}
		return nbKm; 
	}

	public int getLimite() {
		if(pileLimite.isEmpty() || pileLimite.get(0) instanceof FinLimite) {
			return 200;
		}
		for(Botte botte : ensembleBotte) {
			if(botte.getType() == Type.FEU) {
				return 200;
			}
		}
		return 50;
	}

	public boolean estBloque() {
		Bataille sommet;
		Botte Prioritaire = new Botte(1, Type.FEU);
		Attaque feuRouge = new Attaque(1, Type.FEU);
		Parade feuVert = new Parade(1, Type.FEU);
		boolean isPrioritaire = ensembleBotte.contains(Prioritaire);
		
		if(pileBataille.isEmpty() && isPrioritaire) { // la pile de bataille est vide et il est prioritaire,
			return false;
		}
		
		else if(!pileBataille.isEmpty()) {
			sommet = pileBataille.get(pileBataille.size() - 1);
			Botte botteSommet = new Botte(1, sommet.getType());
			if(sommet.equals(feuVert)) { // le sommet est une parade de type FEU
				return false;
			}
			
			if(isPrioritaire) {
				if(sommet.equals(feuRouge)) {
					return false;
				}
				
				else if(sommet instanceof Parade) {
					return false;
				}
				
				else if(sommet instanceof Attaque && ensembleBotte.contains(botteSommet)) {
					return false;
				}
			}
			
		
	}








}

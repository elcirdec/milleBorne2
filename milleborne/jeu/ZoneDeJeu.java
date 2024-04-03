package jeu;

import java.util.ArrayList;
import java.util.List;

import cartes.*;
import cartes.Probleme.Type;


public class ZoneDeJeu implements Cartes {

	List<Limite> pileLimite = new ArrayList<>();
	List<Bataille> pileBataille = new ArrayList<>();
	List<Borne> collectionBorne = new ArrayList<>();
	List<Botte> ensembleBotte = new ArrayList<>();
	 

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



	public int donnerLimitationVitesse() {
		if(pileLimite.isEmpty() || pileLimite.get((pileLimite.size() - 1)) instanceof FinLimite) {
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
		boolean isPrioritaire = ensembleBotte.contains(PRIORITAIRE);
		
		if(pileBataille.isEmpty() && isPrioritaire) { // la pile de bataille est vide et il est prioritaire,
			return false;
		}
		
		else if(!pileBataille.isEmpty()) {
			sommet = pileBataille.get(pileBataille.size() - 1);
			Botte botteSommet = new Botte(1, sommet.getType());
			if(sommet.equals(FEU_VERT)) { // le sommet est une parade de type FEU
				return false;
			}
			
			if(isPrioritaire) {
				if(sommet.equals(FEU_ROUGE)) {
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

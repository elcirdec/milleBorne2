package testsFonctionnels;

import java.util.List;

import cartes.*;
import jeu.*;

public class TestJoueur {
	public static void main(String[] args) {
		Joueur joueur = new Joueur("J1");
		ZoneDeJeu zoneDeJeu = new ZoneDeJeu();
		System.out.println("Avant ajout : "+joueur.donnerKmParcourus());
		Borne b1 = new Borne(100,1);
		List<Borne> bornes = zoneDeJeu.getCollectionBorne();
		bornes.add(b1);
		System.out.println("Apres ajout de 100 : "+joueur.donnerKmParcourus());
		Borne b2 = new Borne(100,1);
		Borne b3 = new Borne(25,1);
		bornes.add(b2);
		bornes.add(b3);
		System.out.println("Apres ajout de 100 et 25 : "+joueur.donnerKmParcourus());
	}
}

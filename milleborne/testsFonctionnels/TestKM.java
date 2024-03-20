package testsFonctionnels;

import static org.junit.jupiter.api.Assertions.*;

import jeu.*;
import java.util.List;
import cartes.Borne;

public class TestKM {

	public static void main(String[] args) {
		Joueur joueur = new Joueur("J1");
		System.out.println("Avant ajout : "+joueur.getKM());
		Borne b1 = new Borne(100,1);
		List<Borne> bornes = joueur.getCollectionBorne();
		bornes.add(b1);
		System.out.println("Apres ajout de 100 : "+joueur.getKM());
		Borne b2 = new Borne(100,1);
		Borne b3 = new Borne(25,1);
		bornes.add(b2);
		bornes.add(b3);
		System.out.println("Apres ajout de 100 et 25 : "+joueur.getKM());
	}

}
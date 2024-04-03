package testsFonctionnels;

import java.util.List;
import cartes.*;
import cartes.Probleme.Type;
import jeu.*;


public class TestZoneDeJeu implements Cartes{
	public static void main(String[] args) {
		Joueur joueur = new Joueur("J1");
		ZoneDeJeu zoneDeJeu = new ZoneDeJeu();
		List<Bataille> batailles = zoneDeJeu.getPileBataille();
		List<Botte> bottes = zoneDeJeu.getEnsembleBotte();
		
		Attaque accident = new Attaque(1, Type.ACCIDENT);
		Attaque panneEssence = new Attaque(1, Type.ESSENCE);
		Parade essence = new Parade(1, Type.ESSENCE);
		Botte asDuVolant = new Botte(1, Type.ACCIDENT);
		
		
		System.out.println(zoneDeJeu.estBloque());
		batailles.add(FEU_ROUGE);
		System.out.println(zoneDeJeu.estBloque());
		bottes.add(PRIORITAIRE);
		System.out.println(zoneDeJeu.estBloque());
		batailles.add(accident);
		System.out.println(zoneDeJeu.estBloque());
		bottes.add(asDuVolant);
		System.out.println(zoneDeJeu.estBloque());
		batailles.add(panneEssence);
		System.out.println(zoneDeJeu.estBloque());
		batailles.add(essence);		
		System.out.println(zoneDeJeu.estBloque());
		
		batailles.add(FEU_VERT);		
		System.out.println(zoneDeJeu.estBloque());
				

	}

}

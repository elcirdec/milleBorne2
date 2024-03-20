package jeu;

import cartes.Carte;

public interface Main extends Iterable<Carte>{
	public void prendre(Carte carte);
	public void jouer(Carte carte);
	
}

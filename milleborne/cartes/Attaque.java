package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {

		String nom = "";

		switch(getType()) {

		case CREVAISON:
			nom = "Crevaison";
			break;
		case ESSENCE:
			nom = " Panne d'essence";
			break;

		case ACCIDENT:
			nom = "Accident";
			break;
			
		case FEU:
			nom = " Feu rouge";
			break;

		}
		return nom;
	}
}
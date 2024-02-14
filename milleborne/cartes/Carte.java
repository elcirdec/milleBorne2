package cartes;

public abstract class Carte {
	private int nombre;
	
	public Carte(int nombre) {
		super();
		this.nombre = nombre;
	}


	public int getNombre() {
		return nombre;
	}
}

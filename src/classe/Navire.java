package classe;

import interfa.INavire;

public abstract class Navire implements INavire {
	
	// Attribut
	protected String immatriculation;
	protected String nom;
	
	
	
	
	// Constructeurs
	public Navire() {}

	public Navire(String immatriculation, String nom) {

		this.immatriculation = immatriculation;
		this.nom = nom;
	}

	
	// getters setters
	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	// methodes Absraites
	public abstract int getVitesseMaximale();
	
	
	
	// redefinition des methodes
	@Override
	public int getDestination() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVitesse() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLatitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLongitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Navire [immatriculation=" + immatriculation + ", nom=" + nom + "]";
	}

	
	
	
}

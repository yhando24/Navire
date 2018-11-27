package classe;

public class Voilier extends Navire{
	
	// Attribut
	private int nbVoiles;
	private int passagersTotal;
	
	
	
	
	
	
	// Constructeurs
	public Voilier(String immatriculation, String nom, int nbVoiles, int passagersTotal) {
		super(immatriculation, nom);
		this.nbVoiles = nbVoiles;
		this.passagersTotal = passagersTotal;
	}

	
	// getters setters
	public int getNbVoiles() {
		return nbVoiles;
	}

	public void setNbVoiles(int nbVoiles) {
		this.nbVoiles = nbVoiles;
	}

	public int getPassagersTotal() {
		return passagersTotal;
	}

	public void setPassagersTotal(int passagersTotal) {
		this.passagersTotal = passagersTotal;
	}






	
	// redefinition des methodes
	@Override
	public int getVitesseMaximale() {
	
		return 300;
	}

}

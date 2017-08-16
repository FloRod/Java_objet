package tp6;

public class CompteClient {
	private Client client;
	private double solde;
	private boolean decouvertAutorise;
	private double plafondDecouvert;
	
	public CompteClient(Client client, double solde, boolean decouvertAutorise, double plafondDecouvert){
		this.client = client;
		this.solde = solde;
		this.decouvertAutorise = decouvertAutorise;
		this.plafondDecouvert = plafondDecouvert;
	}
	
	/**
	 * permet d'ajouter un montant au solde d'un compte
	 */
	public void creditCompte(double montant){
		this.solde += montant;
	}
	
	
	/**
	 * permet de débiter un montant au solde d'un compte du moment que ce 
	 */
	public void debitCompte(double montant){
		double plafond = this.solde - montant;
		
		// le plafond est un nombre positif => il faut le convertir en nombre négatif (choix du -1 car plus explicite)
		if (this.decouvertAutorise && plafond > (this.plafondDecouvert * -1)){
			this.solde = plafond;
		}
		else {
			System.out.println("Débit impossible. Contactez votre banquier");
		}
	}

	//getter & setter des attributs de la classe Client
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public boolean isDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(boolean decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	public double getPlafondDecouvert() {
		return plafondDecouvert;
	}

	public void setPlafondDecouvert(double plafondDecouvert) {
		this.plafondDecouvert = plafondDecouvert;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	//redéfinition de toString
	public String toString() {
		return getClient().toString() + this.solde + "\t" + this.decouvertAutorise + " : " + this.plafondDecouvert;
	}
}

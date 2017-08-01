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
	
	public void creditCompte(double montant){
		this.solde += montant;
	}
	
	public void debitCompte(double montant){
		double plafond = this.solde - montant;
		if (this.decouvertAutorise == true && plafond <this.plafondDecouvert){
			this.solde = plafond;
		}
		else {
			System.out.println("Débit impossible. Contactez votre banquier");
		}
	}

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
}

package tp6;

public class CompteFactory {
	
	public static CompteClient getCompte (String nom, int age, double solde, boolean decouvertAutorise, double plafondDecouvert) {
		Client client = new Client (nom, age);
		CompteClient compte = new CompteClient(client, solde, decouvertAutorise, plafondDecouvert);
		
		return compte;
	}

}

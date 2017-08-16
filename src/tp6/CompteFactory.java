package tp6;

public class CompteFactory {
	
	/**
	 * permet l'initialisation des clients en tenant compte des classes CompteClient et Client. 
	 * Complètement transparent pour l'utilisateur qui ne rentre que des paramètres
	 */
	
	public static CompteClient getCompte (String nom, int age, double solde, boolean decouvertAutorise, double plafondDecouvert) {
		Client client = new Client (nom, age);
		CompteClient compte = new CompteClient(client, solde, decouvertAutorise, plafondDecouvert);
		
		return compte;
	}

}

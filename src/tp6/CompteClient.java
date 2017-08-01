package tp6;

import java.util.Scanner;

public class CompteClient {
	private Client client;
	private double solde;
	private boolean decouvertAutorise;
	private double plafondDecouvert;
	
	public void creditCompte(Client client, Scanner sc){
		System.out.println("Quel est le montant à ajouter ?");
		double montant = sc.nextDouble();
		this.solde += montant;
	}
}

package tp6;

import java.util.ArrayList;

public class ExtractionServices {
	
	public ArrayList<CompteClient> tabClientTampon= new ArrayList<CompteClient>(); // tableau de tri
	
	/**
	 * permet le tri des comptes selon leur solde
	 */
	public ArrayList<CompteClient> compteTriSoldeSup(ArrayList<CompteClient> tabClient, double montant){
		
		for (CompteClient i : tabClient){
			if (montant < i.getSolde()){
				tabClientTampon.add(i);
			}
		}
	return tabClientTampon;
	}
	
	/**
	 * permet le tri des comptes selon un encadrement de l'âge des clients
	 */
	public ArrayList<CompteClient> compteTriAgeClient(ArrayList<CompteClient> tabClient, int ageMin, int ageMax){
		
		for (CompteClient i : tabClient){
			if (ageMin < i.getClient().getAge() && ageMax > i.getClient().getAge() ){
				tabClientTampon.add(i);
			}
		}
		return tabClientTampon;
	}
	
	/**
	 * permet de faire la moyenne du solde des comptes contenus dans une liste
	 */
	public Double compteMoyenne(ArrayList<CompteClient> tabClient){
		
		double moyenne = 0;
		double somme = 0;
		
		for (CompteClient i : tabClient) {
			somme += i.getSolde();
		}
		
		moyenne = somme / (double) tabClient.size();
		return moyenne;
	}

}

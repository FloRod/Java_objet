package tp6;

import java.util.ArrayList;

public class ExtractionServices {
	
	public ArrayList<CompteClient> newTabClient= new ArrayList<CompteClient>();
	
	public ArrayList<CompteClient> compteTriSoldeSup(ArrayList<CompteClient> tabClient, double montant){
		
		for (CompteClient i : tabClient){
			if (montant < i.getSolde()){
				newTabClient.add(i);
			}
		}
	return newTabClient;
	}
	
	public ArrayList<CompteClient> compteTriAgeClient(ArrayList<CompteClient> tabClient, int ageMin, int ageMax){
		
		for (CompteClient i : tabClient){
			if (ageMin < i.getClient().getAge() && ageMax > i.getClient().getAge() ){
				newTabClient.add(i);
			}
		}
		return newTabClient;
	}
	
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

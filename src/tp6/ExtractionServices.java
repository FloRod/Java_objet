package tp6;

import java.util.ArrayList;

public class ExtractionServices {
	
	public ArrayList<CompteClient> newTabClient= new ArrayList<CompteClient>();
	
	public ArrayList<CompteClient> compteSoldeSup(ArrayList<CompteClient> tabClient, double montant){
		
		for (CompteClient i : tabClient){
			if (montant < i.getSolde()){
				newTabClient.add(i);
			}
		}
	return newTabClient;
	}

}

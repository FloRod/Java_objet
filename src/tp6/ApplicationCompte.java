package tp6;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationCompte {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		ArrayList<CompteClient> client = new ArrayList<CompteClient>();			//liste de tous les clients
		ArrayList<CompteClient> tabTriClient = new ArrayList<CompteClient>();	//pour le tri des clients
		
		/**
		 * initialisation des clients dans la liste à l'aide de la méthode getCompte de la classe CompteFactory
		 */
		client.add(CompteFactory.getCompte("Martin", 37 , 250, false, 0));
		client.add(CompteFactory.getCompte("Strome", 28, 1375, true, 450));
		client.add(CompteFactory.getCompte("Gilbert", 59, 9750, true, 1000));
		client.add(CompteFactory.getCompte("Ali", 51, 5240, true, 1000));
		client.add(CompteFactory.getCompte("Macron", 40, 15500, true, 2500));
		client.add(CompteFactory.getCompte("Matthias", 24, -150, true, 450));
		client.add(CompteFactory.getCompte("Serendim", 29, 490, false, 0));
		client.add(CompteFactory.getCompte("Goura", 71, 1500, true, 450));
	
		System.out.println("Les clients et leur compte répertoriés dans notre banque sont les suivants : ");
		for (CompteClient i : client){
			System.out.println(i.toString());
		}
		
		
		/**
		 * Tri par le solde
		 */
		System.out.println("Donnez le montant minimale du solde pour le tri des comptes :");
		double montant = sc.nextDouble();
		
		ExtractionServices triService = new ExtractionServices();
		tabTriClient = triService.compteTriSoldeSup(client, montant);
		System.out.println("Voici les comptes dont le solde est supérieur à " + montant);
			
		for (CompteClient i : tabTriClient){
			System.out.println(i.toString());
		}
		
		double moyenne = 0;
		moyenne = triService.compteMoyenne(tabTriClient);
		System.out.println("La moyenne du solde de ces comptes est " + moyenne);
		
		/**
		 * Tri par l'âge
		 */
		
		tabTriClient.clear();
		
		System.out.println("Donnez l'âge minimal des clients dont les comptes doivent être sélectionnés :");
		int ageMin = sc.nextInt();
		System.out.println("Donnez l'âge maximal des clients dont les comptes doivent être sélectionnés :");
		int ageMax = sc.nextInt();
		
		tabTriClient = triService.compteTriAgeClient(client, ageMin, ageMax);
		System.out.println("Voici les comptes correspondants");
		for (CompteClient i : tabTriClient){
			System.out.println(i.toString());
		}
		
		moyenne = triService.compteMoyenne(tabTriClient);
		System.out.println("La moyenne du solde des comptes sélectionnés est " + moyenne);
		
		sc.close();
	}

}

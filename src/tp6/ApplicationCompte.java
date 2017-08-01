package tp6;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		ArrayList<CompteClient> client = new ArrayList<CompteClient>();
		client.add(new CompteClient(new Client ("Martin", 37), 250, false, 0));
		client.add(new CompteClient(new Client ("Strome", 28), 1375, true, 450));
		client.add(new CompteClient(new Client ("Gilbert", 59), 9750, true, 1000));
		client.add(new CompteClient(new Client ("Ali", 51), 5240, true, 1000));
		client.add(new CompteClient(new Client ("Macron", 40), 15500, true, 2500));
		client.add(new CompteClient(new Client ("Matthias", 24), -150, true, 450));
		client.add(new CompteClient(new Client ("Serendim", 29), 490, false, 0));
		client.add(new CompteClient(new Client ("Goura", 71), 1500, true, 450));
		
		for (CompteClient i : client){
			System.out.println(i.getClient().getNom() + "\t" + i.getClient().getAge() + "\t" + i.getSolde() + "\t" + i.getPlafondDecouvert());
		}
			System.out.println("montant :");
			double montant = sc.nextDouble();
			ArrayList<CompteClient> testClient = new ArrayList<CompteClient>();
			ExtractionServices test = new ExtractionServices();
			testClient = test.compteSoldeSup(client, montant);
			
			for (CompteClient j : testClient){
				System.out.println(j.getClient().getNom() + "\t" + j.getClient().getAge() + "\t" + j.getSolde() + "\t" + j.getPlafondDecouvert());
			
		}
		sc.close();
	}

}

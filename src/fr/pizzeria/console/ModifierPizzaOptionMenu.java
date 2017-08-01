package fr.pizzeria.console;

import java.util.Scanner;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends OptionMenu{
	
	private IPizzaDao dao;
	private Scanner sc;

	public ModifierPizzaOptionMenu (IPizzaDao dao, Scanner sc){
		this.dao = dao;
		this.sc = sc;
	}

	public void execute(){
		
		int index=-1;
		
		System.out.println("Sélection du menu Mise à jour d'une pizza");
		System.out.println("Entrez le code de la pizza à mettre à jour :");
		
		do
		{
			String lastCode = sc.next();
			index = dao.existPizza(lastCode);
			//demande saisie utilisateur
			
			if (index != -1){
				System.out.println("Veuillez saisir le nouveau code :");
				String code = sc.next();

				System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
				String nom = sc.next();

				System.out.println("Veuillez saisir le prix :");
				double prix = sc.nextDouble();
				
				//modification de la pizza
				Pizza majPizza = new Pizza (code, nom, prix);
				dao.updatePizza(lastCode, majPizza);
			}
			else {
				System.out.println("Code introuvable ! Veuillez saisir de nouveau le code :");
			}
		}
		while (index == -1);

	}
}

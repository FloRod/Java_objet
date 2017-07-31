package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends OptionMenu{
	
	private ArrayList<Pizza> tabPizza;
	private Scanner sc;

	public ModifierPizzaOptionMenu (ArrayList<Pizza> tabPizza, Scanner sc){
		this.tabPizza = tabPizza;
		this.sc = sc;
	}

	public void execute(){
		
		int index = -1; // variable conditionnelle sur le while et parametre de modification d'un objet du tableau
		
		System.out.println("Sélection du menu Mise à jour d'une pizza");
		System.out.println("Entrez le code de la pizza à mettre à jour :");
		
		do
		{
			String lastCode = sc.next();

			//	int index = tabPizza.indexOf(lastCode); ==> pour l'utiliser, il faut redéfinir equals

			//recherche du code dans tabPizza
			for(int i=0; i<tabPizza.size(); i++){
				if (lastCode.equals(tabPizza.get(i).getCode())){
					index = i;
				}
			}

			//demande saisie utilisateur
			if (index != -1){
				System.out.println("Veuillez saisir le nouveau code :");
				String code = sc.next();

				System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
				String nom = sc.next();

				System.out.println("Veuillez saisir le prix :");
				double prix = sc.nextDouble();

				//modification de la pizza
				tabPizza.set(index, new Pizza (code, nom, prix));
			}
			else {
				System.out.println("Code introuvable ! Veuillez saisir de nouveau le code :");
			}
		}
		while (index == -1);

	}
}

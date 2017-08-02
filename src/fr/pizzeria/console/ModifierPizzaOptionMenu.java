package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner sc;

	public ModifierPizzaOptionMenu (IPizzaDao dao, Scanner sc){
		this.dao = dao;
		this.sc = sc;
	}

	public void execute() throws UpdatePizzaException {

		int index=-1;

		System.out.println("Sélection du menu Mise à jour d'une pizza");
		System.out.println("Entrez le code de la pizza à mettre à jour :");

		String lastCode = sc.next();

		//vérifier que le code a plus de trois caractère
		if (lastCode.length() != 3){
			throw new UpdatePizzaException("Erreur ! Le code doit contenir exactement 3 caractères.");
		}

		index = dao.existPizza(lastCode);


		//demande saisie utilisateur avec exception si le code est introuvable
		if (index == -1){
			throw new UpdatePizzaException("Code introuvable !");
		}
		else {
			System.out.println("Veuillez saisir le nouveau code :");
			String code = sc.next();

			System.out.println("Veuillez saisir le nouveau nom (sans espace) :");
			String nom = sc.next();

			System.out.println("Veuillez saisir le prix :");
			double prix = sc.nextDouble();
			
			System.out.println("Veuillez saisir la caractéristique : (viande, sans viande, poisson)");
			String feature = sc.next();
			
			CategoriePizza cat = CategoriePizza.valueOf(feature);
			System.out.println("cat");

			//modification de la pizza
			Pizza majPizza = new Pizza (code, nom, prix, cat );
			dao.updatePizza(lastCode, majPizza);
		}
	}
}

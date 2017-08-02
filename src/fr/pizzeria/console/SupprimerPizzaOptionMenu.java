package fr.pizzeria.console;
import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;

public class SupprimerPizzaOptionMenu extends OptionMenu{

	private IPizzaDao dao;
	private Scanner sc;

	public SupprimerPizzaOptionMenu (IPizzaDao dao, Scanner sc){
		this.dao = dao;
		this.sc = sc;
	}

	public void execute() throws DeletePizzaException{

		int index = -1; // parametre de modification d'un objet du tableau

		System.out.println("Sélection du menu Suppression d'une pizza");
		System.out.println("Entrez le code de la pizza à supprimer :");

		do
		{
			String lastCode = sc.next();
			
			//test du code par rapport à son nombre de caractère
			if (lastCode.length() != 3){
				throw new DeletePizzaException("Erreur ! Le code doit contenir exactement 3 caractères.");
			}
			
			index = dao.existPizza(lastCode);

			//demande saisie utilisateur
			if (index != -1){
				dao.deletePizza(lastCode, index);
			}
			else{
				System.out.println("Code introuvable ! Veuillez saisir de nouveau le code :");
			}
		}
		while (index == -1);
	}

}

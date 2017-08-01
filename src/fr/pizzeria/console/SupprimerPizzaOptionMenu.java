package fr.pizzeria.console;
import java.util.Scanner;

public class SupprimerPizzaOptionMenu extends OptionMenu{
	
	private IPizzaDao dao;
	private Scanner sc;

	public SupprimerPizzaOptionMenu (IPizzaDao dao, Scanner sc){
		this.dao = dao;
		this.sc = sc;
	}

	public void execute(){

		int index = -1; // variable conditionnelle sur le while et parametre de modification d'un objet du tableau
		
		System.out.println("Sélection du menu Suppression dune pizza");
		System.out.println("Entrez le code de la pizza à supprimer :");

		do
		{
			String lastCode = sc.next();
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

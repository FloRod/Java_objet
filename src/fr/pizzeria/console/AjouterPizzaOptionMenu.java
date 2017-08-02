package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends OptionMenu {
	
	private IPizzaDao dao;
	private Scanner sc;

	public AjouterPizzaOptionMenu (IPizzaDao dao, Scanner sc){
		this.dao = dao;
		this.sc = sc;
		
	}
	
	public void execute() throws SavePizzaException{
		
		System.out.println("Sélection ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code :");
		String code = sc.next();
		
		//vérifier que le code a plus de trois caractère
		if (code.length() != 3){
			throw new SavePizzaException("Erreur ! Le code doit contenir exactement 3 caractères.");
		}
		
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nom = sc.next();
//		System.out.println("test " + nom.matches("[0-9]?"));
//		if (nom.matches("[a-zA-Z?]")){
//			throw new SavePizzaException("Erreur ! Le nom ne doit contenir que des lettres.");
//		}
		
		System.out.println("Veuillez saisir le prix :");
		double prix = sc.nextDouble();
		
		System.out.println("Veuillez saisir la caractéristique : (viande, sans viande, poisson)");
		String choix = sc.next();
		
		CategoriePizza ajout = CategoriePizza.conversion(choix);
		System.out.println("feature : " + ajout.getFeature());
		System.out.println("CategoriePizza : " + ajout);
		
		Pizza nouvellePizza = new Pizza(code, nom, prix, ajout);
			dao.saveNewPizza(nouvellePizza);
	}
}

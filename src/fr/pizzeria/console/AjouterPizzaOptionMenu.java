package fr.pizzeria.console;

import java.util.Scanner;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends OptionMenu {
	
	private IPizzaDao dao;
	private Scanner sc;

	public AjouterPizzaOptionMenu (IPizzaDao dao, Scanner sc){
		this.dao = dao;
		this.sc = sc;
		
	}
	
	public void execute(){
		
		System.out.println("Sélection ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code :");
		String code = sc.next();
		
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nom = sc.next();
		
		System.out.println("Veuillez saisir le prix :");
		double prix = sc.nextDouble();
		
		Pizza nouvellePizza = new Pizza(code, nom, prix);
		dao.saveNewPizza(nouvellePizza);
		
		
	}

}

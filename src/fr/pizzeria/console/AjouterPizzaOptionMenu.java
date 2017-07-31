package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends OptionMenu {
	
	private ArrayList<Pizza> tabPizza;
	private Scanner sc;

	public AjouterPizzaOptionMenu (ArrayList<Pizza> tabPizza, Scanner sc){
		this.tabPizza = tabPizza;
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
		
		tabPizza.add(new Pizza (code, nom, prix));
	}

}

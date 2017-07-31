package fr.pizzeria.console;


import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public class PizzaDaoMemoire implements IPizzaDao{
	
	private ArrayList<Pizza> tabPizza = new ArrayList<Pizza>();
	
	public PizzaDaoMemoire () {
		tabPizza.add(new Pizza ("PEP", "Pépéroni", 12.5));
		tabPizza.add(new Pizza ("MAR", "Margherita", 14));
		tabPizza.add(new Pizza ("REI", "Reine", 11.5));
		tabPizza.add(new Pizza ("FRO", "4 fromages", 12));
		tabPizza.add(new Pizza ("CAN", "Cannibale", 12.5));
		tabPizza.add(new Pizza ("SAV", "Savoyarde", 13));
		tabPizza.add(new Pizza ("ORI", "Orientale", 13.5));
		tabPizza.add(new Pizza ("IND", "indienne", 14));
	}
	
	public ArrayList<Pizza> findAllPizzas() {
		return tabPizza;
	}
	boolean saveNewPizza(Pizza pizza) {
		return false;
	}
	boolean updatePizza(String codePizza, Pizza pizza) {
		return false;
	}
	boolean deletePizza(String codePizza) {
		return false;
	}

}

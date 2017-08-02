package fr.pizzeria.console;


import java.util.ArrayList;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class PizzaDaoMemoire implements IPizzaDao{
	
	private ArrayList<Pizza> tabPizza = new ArrayList<Pizza>();
	
	public PizzaDaoMemoire () {
		tabPizza.add(new Pizza ("PEP", "Pépéroni", 12.5, CategoriePizza.SANS_VIANDE));
		tabPizza.add(new Pizza ("MAR", "Margherita", 14, CategoriePizza.VIANDE));
		tabPizza.add(new Pizza ("REI", "Reine", 11.5, CategoriePizza.VIANDE));
		tabPizza.add(new Pizza ("FRO", "4 fromages", 12, CategoriePizza.SANS_VIANDE));
		tabPizza.add(new Pizza ("CAN", "Cannibale", 12.5, CategoriePizza.VIANDE));
		tabPizza.add(new Pizza ("SAV", "Savoyarde", 13, CategoriePizza.SANS_VIANDE));
		tabPizza.add(new Pizza ("ORI", "Orientale", 13.5, CategoriePizza.POISSON));
		tabPizza.add(new Pizza ("IND", "indienne", 14, CategoriePizza.POISSON));
	}
	
	@Override
	public ArrayList<Pizza> findAllPizzas() {
		return tabPizza;
	}
	
	@Override
	public boolean saveNewPizza(Pizza pizza) {
		tabPizza.add(pizza);
		return false;
	}
	
	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		int index =existPizza(codePizza);
		tabPizza.set(index, pizza);
		return false;
	}
	
	@Override
	public boolean deletePizza(String codePizza, int index) {
		tabPizza.remove(index);
		return false;
	}
	
	@Override
	public int existPizza(String codePizza) {
		int index = -1;
		for(int i=0; i<tabPizza.size() && index == -1; i++){
			if (codePizza.equals(tabPizza.get(i).getCode())){
				index = i;
			}
		}
		return index;
	}

}

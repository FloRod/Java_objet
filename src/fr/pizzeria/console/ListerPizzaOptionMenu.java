package fr.pizzeria.console;

import fr.pizzeria.model.Pizza;

public class ListerPizzaOptionMenu extends OptionMenu{

	private IPizzaDao dao;

	public ListerPizzaOptionMenu (IPizzaDao dao){
		this.dao = dao;
	}

	public void execute(){

		System.out.println("Sélection du menu Liste de pizza");

		for(Pizza i : dao.findAllPizzas()){
			System.out.println(i.toString());
		}
	}
}
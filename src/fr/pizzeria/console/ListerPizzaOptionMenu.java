package fr.pizzeria.console;
import java.util.ArrayList;
import fr.pizzeria.model.Pizza;

public class ListerPizzaOptionMenu extends OptionMenu{
	
	private ArrayList<Pizza> tabPizza;

	public ListerPizzaOptionMenu (ArrayList<Pizza> tabPizza){
		this.tabPizza = tabPizza;
	}

	public void execute(){
		
		System.out.println("Sélection du menu Liste de pizza");
		for(int i=0;i<tabPizza.size();i++){
			System.out.println(tabPizza.get(i).getCode() + " --> " + tabPizza.get(i).getNom() + " ("
					+ tabPizza.get(i).getPrix() + " €)");
		}
}
}
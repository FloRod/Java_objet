package fr.pizzeria.console;
//import java.util.ArrayList;
//import fr.pizzeria.model.Pizza;

public class ListerPizzaOptionMenu extends OptionMenu{
	
	private IPizzaDao dao;

	public ListerPizzaOptionMenu (IPizzaDao dao){
		this.dao = dao;
	}

	public void execute(){
		
		System.out.println("Sélection du menu Liste de pizza");
		for(int i=0;i<dao.findAllPizzas().size();i++){
			System.out.println(dao.findAllPizzas().get(i).getCode() + " --> " + dao.findAllPizzas().get(i).getNom() + " ("
					+ dao.findAllPizzas().get(i).getPrix() + " €)");
		}
}
}
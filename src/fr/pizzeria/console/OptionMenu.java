package fr.pizzeria.console;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;

public abstract class OptionMenu {
	
	public abstract void execute() throws UpdatePizzaException, SavePizzaException, DeletePizzaException;

}

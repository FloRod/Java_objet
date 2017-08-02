package fr.pizzeria.console;
import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int choix = 0;
		
		PizzaDaoMemoire dao = new PizzaDaoMemoire();

		while (choix!=99){
			//affiche le Menu et récupère la valeur saisie
			Affichage.affichageMenu();
			choix = sc.nextInt();

			//Entrée dans le menu
			switch (choix) {
			case 1 : {
				ListerPizzaOptionMenu menu = new ListerPizzaOptionMenu(dao);
				menu.execute();
				}
			break;
			case 2 :{
				AjouterPizzaOptionMenu nouvellePizza = new AjouterPizzaOptionMenu(dao, sc);
				try {
					nouvellePizza.execute();
				} catch (SavePizzaException e) {
					System.out.println(e.getMessage());
				}
			}
			break;
			case 3 :{
				ModifierPizzaOptionMenu pizzaModifie = new ModifierPizzaOptionMenu(dao, sc);
				try {
					pizzaModifie.execute();
				} catch (UpdatePizzaException e) {
					System.out.println(e.getMessage());
				}
			}
			break;
			case 4 :{
				SupprimerPizzaOptionMenu pizzaSuppr = new SupprimerPizzaOptionMenu(dao, sc);
				try {
					pizzaSuppr.execute();
				} catch (DeletePizzaException e) {
					System.out.println(e.getMessage());
				}
			}
			case 99 :{
				System.out.println("Au revoir !");
			}
			break;
			default : {
				System.out.println("Saisie incorrecte. Veuillez réesssayer !");
			}
			}

		}
		sc.close();
	}
}

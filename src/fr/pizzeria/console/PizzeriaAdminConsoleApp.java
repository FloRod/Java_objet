package fr.pizzeria.console;
import java.util.Scanner;

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
				nouvellePizza.execute();
			}
			break;
			case 3 :{
				ModifierPizzaOptionMenu pizzaModifie = new ModifierPizzaOptionMenu(dao, sc);
				pizzaModifie.execute();
			}
			break;
			case 4 :{
				SupprimerPizzaOptionMenu pizzaSuppr = new SupprimerPizzaOptionMenu(dao, sc);
				pizzaSuppr.execute();
			}
			break;
			default : {
				System.out.println("Au revoir !");
			}
			}

		}
		sc.close();
	}
}

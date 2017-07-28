package fr.pizzeria.console;
import java.util.ArrayList;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int choix = 0;
		
		ArrayList<Pizza> tabPizza = new ArrayList<Pizza>;
		
		tabPizza.add(new Pizza ("PEP", "Pépéroni", 12.5));
		tabPizza.add(new Pizza ("MAR", "Margherita", 14));
		tabPizza.add(new Pizza ("REI", "Reine", 11.5));
		tabPizza.add(new Pizza ("FRO", "4 fromages", 12));
		tabPizza.add(new Pizza ("CAN", "Cannibale", 12.5));
		tabPizza.add(new Pizza ("SAV", "Savoyarde", 13));
		tabPizza.add(new Pizza ("ORI", "Orientale", 13.5));
		tabPizza.add(new Pizza ("IND", "indienne", 14));

		while (choix!=99){
			//affiche le Menu et récupère la valeur saisie
			affichageMenu();
			choix = sc.nextInt();

			//Entrée dans le menu
			switch (choix) {
			case 1 : {
				System.out.println("Sélection du menu Liste de pizza");
				for(int i=0;i<tabPizza.length;i++){
					System.out.println(tabPizza[i].getCode() + " --> " + tabPizza[i].getNom() + " (" + tabPizza[i].getPrix() + " €)");
				}
			}
			break;
			case 2 :{
				System.out.println("Sélection ajout d'une nouvelle pizza");
			}
			break;
			case 3 :{
				System.out.println("Sélection du menu Mise à jour d'une pizza");
			}
			break;
			case 4 :{
				System.out.println("Sélection du menu Suppression dune pizza");
			}
			break;
			default : {
				System.out.println("Au revoir !");
			}
			}

		}
		sc.close();
	}

	public static void affichageMenu() {
		System.out.println("\n***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir \u263a");
		System.out.println("Choix du menu :");
	}

}

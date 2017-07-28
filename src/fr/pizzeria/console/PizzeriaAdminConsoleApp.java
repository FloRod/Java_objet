package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int choix = 0;
		
		while (choix!=99){
			//Menu
			System.out.println("\n***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre � jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");
			System.out.println("Choix du menu :");
			choix = sc.nextInt();
			
			switch (choix) {
			case 1 : {
				System.out.println("S�lection du menu Liste de pizza");
			}
			break;
			case 2 :{
				System.out.println("S�lection ajout d'une nouvelle pizza");
			}
			break;
			case 3 :{
				System.out.println("S�lection du menu Mise � jour d'une pizza");
			}
			break;
			case 4 :{
				System.out.println("S�lection du menu Suppression dune pizza");
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

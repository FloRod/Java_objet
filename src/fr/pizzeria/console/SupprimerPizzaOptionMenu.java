package fr.pizzeria.console;
import java.util.ArrayList;
import java.util.Scanner;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzaOptionMenu {

	public void execute(ArrayList<Pizza> tabPizza, Scanner sc){

		System.out.println("Sélection du menu Suppression dune pizza");
		int index = -1; // variable conditionnelle sur le while et parametre de modification d'un objet du tableau

		System.out.println("Entrez le code de la pizza à supprimer :");

		do
		{
			String lastCode = sc.next();

			//	int index = tabPizza.indexOf(lastCode); ==> pour l'utiliser, il faut redéfinir equals

			//recherche du code dans tabPizza
			for(int i=0; i<tabPizza.size() && index == -1; i++){
				if (lastCode.equals(tabPizza.get(i).getCode())){
					index=i;
				}
			}

			//demande saisie utilisateur
			if (index != -1){
				for(int i=index; i<tabPizza.size()-1; i++){
					tabPizza.set(i, tabPizza.get(i+1));
				}
			tabPizza.remove(tabPizza.size()-1);
			}
			else{
				System.out.println("Code introuvable ! Veuillez saisir de nouveau le code :");
				}
		}
		while (index == -1);

	}

}

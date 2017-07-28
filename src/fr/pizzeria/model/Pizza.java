package fr.pizzeria.model;

public class Pizza {
		int id;
		String code;
		String nom;
		double prix;
		int index;

public Pizza (int id, String code, String nom, double prix){
	this.id = id;
	this.code = code;
	this.nom = nom;
	this.prix = prix;
	this.index ++;
}
}

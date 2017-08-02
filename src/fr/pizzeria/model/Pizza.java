package fr.pizzeria.model;

public class Pizza {
	private static int nextId =0;
	private int id;
	private String code;
	private String nom;
	private double prix;
	private CategoriePizza cat;
	

	public Pizza (String code, String nom, double prix, CategoriePizza cat){
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.cat = cat;
		this.id = nextId;
		nextId++;
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public CategoriePizza getCat() {
		return cat;
	}

	public void setCat(CategoriePizza cat) {
		this.cat = cat;
	}
}

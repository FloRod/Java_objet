package tp6;

public class Client {
	private String nom;
	private int age;
	
	public Client (String nom, int age){
		this.nom = nom;
		this.age = age;
	}
	
	
	//getter & setter des attributs de la classe Client
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//redéfinition de toString
	public String toString() {
		return this.nom + "\t\t" + this.age + "\t";
	}
}

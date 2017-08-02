package fr.pizzeria.model;

public enum CategoriePizza {
	VIANDE ("viande"),
	POISSON ("poisson"),
	SANS_VIANDE("sans viande");
	
	private String feature;
	
	private CategoriePizza(String feature){
		this.feature = feature;
	}

	public String getFeature() {
		return feature;
	}

//	public void setFeature(String feature) {
//		this.feature = feature;
//	}
	

}

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

	public static CategoriePizza conversion(String element){
		CategoriePizza solution = null;
		for (CategoriePizza i : values()){
			if (i.getFeature().equals(element)){
				solution = i;
			}
		}
		return solution;
	}
	//	public void setFeature(String feature) {
	//		this.feature = feature;
	//	}


}

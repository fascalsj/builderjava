
public class Animal {
	private String species;
	private String ras;
	
//	Builder Initialitation
	public static AnimalBuilder builder() {
		return new AnimalBuilder();
	}
	
//	Setter Getter
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getRas() {
		return ras;
	}
	public void setRas(String ras) {
		this.ras = ras;
	}
//	Generate builder to String
	@Override
	public String toString() {
		return "Animal(species=" + species + ", ras=" + ras + ")";
	}
}


public class AnimalBuilder {
	private String species;
	private String ras;
	
	public AnimalBuilder() {}
	
	public AnimalBuilder(Animal animal) {
		this.species = animal.getSpecies();
		this.ras = animal.getRas();
	}
	
	public AnimalBuilder species(String species) {
		this.species = species;
		return this;
	}
	
	public AnimalBuilder ras(String ras) {
		this.ras = ras;
		return this;
	}
	
	public Animal build() {
		Animal animal = new Animal();
		animal.setRas(ras);
		animal.setSpecies(species);
		return animal;
	}
}

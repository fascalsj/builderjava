

public class Main {
	public static void main(String[] args) {
		
	Animal animal = Animal.builder().species("Kucing").ras("Anggora").build();
	System.out.println(animal.toString()); 
	}

}

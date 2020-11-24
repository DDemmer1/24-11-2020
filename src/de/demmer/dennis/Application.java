package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {
		
		//Der Konstruktor erzeugt einen Hund der direkt die eingegebenen Werte hat
		Hund bello = new Hund("Bello der Hund", "Braun");
		System.out.println(bello.name);
		System.out.println(bello.fellfarbe);
		
		
		//�ber einen Setter kann bspw. ein negatives Alter verhindert werden
		bello.setAge(-55);
		
		//fellfarbe wird hier �berschrieben
		bello.fellfarbe = "Braun";
		
		//Methode ohne R�ckgabe Wert
		bello.bellen("Wuff");
		
		System.out.println(bello.name + " ist " + bello.getAge() + " Jahre alt!" );
		
		// Alter durch einen Getter in eine variable gespeichert
		int alterDesHundesBello = bello.getAge();
		
		System.out.println(alterDesHundesBello);
		
	}

}

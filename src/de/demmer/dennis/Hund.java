package de.demmer.dennis;

public class Hund {
	
	
	public String fellfarbe;
	
	private int age;
	
	public String name;
	
	//Man kann auch andere Objekte als Attribut vergeben
	public Halsband halsband;
	
	
	
	public Hund(String name, String fell) {
		this.name = name;
		this.fellfarbe = fell;
	}
	
	public void bellen(String laut) {
		System.out.println(laut);
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}
	

	
}

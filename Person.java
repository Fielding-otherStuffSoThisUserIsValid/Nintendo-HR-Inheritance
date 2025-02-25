/*
Fielding Parsons
Use inheritance to do HR work for Nintendo
Feb 24 2025
Nintendo-HR-Inheritance
CSCI 2251 R01
*/
public class Person {
	private String name;
	private int height;
	private int weight;
	
	// Default contructor
	public Person() {
		this.name = "J. Doe";
		this.height = 178;
		this.weight = 80;
	}
	
	// Contructor that takes a name, height, and weight
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHeight(int height) {
		this.height = height; 
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return String.format("%-8s %-16d %-12d", name, height, weight);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if (o == this) {
			return true;
		}
		
		if (!(o instanceof Person)) { //https://www.geeksforgeeks.org/overriding-equals-method-in-java/
			return false;
		}
		
		Person p = (Person) o;
		if (p.getName().equals(this.name)) {
			return true;
		}	
		return false; //PLACEHOLDER
	}
}
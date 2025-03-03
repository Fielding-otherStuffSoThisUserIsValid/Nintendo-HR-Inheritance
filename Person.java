/*
Fielding Parsons
Use inheritance to do HR work for Nintendo
Feb 24 2025
Nintendo-HR-Inheritance
CSCI 2251 R01
*/
public class Person implements Comparable<Person> { //https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
	private String name;
	private double height;
	private double weight;
	
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
	
	// Constructor that takes a Person
	public Person(Person JDoe) {
		this.name = JDoe.name;
		this.height = JDoe.height;
		this.weight = JDoe.weight;
	}
	
	// Sets name
	public void setName(String name) {
		this.name = name;
	}
	
	// Gets name
	public String getName() {
		return this.name;
	}
	
	// Sets Height
	public void setHeight(int height) {
		this.height = height; 
	}
	
	// Gets height
	public double getHeight() {
		return this.height;
	}
	
	// Sets weight
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// Gets weight
	public double getWeight() {
		return this.weight;
	}
	
	// This method returns a formatted string that contains the name, height and weight
	@Override
	public String toString() {
		return String.format("%-8s %-16f %12f", this.name, this.height, this.weight);
	}
	
	// This method checks if one member of the Person class is equal to another member of the Person class
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if (o == this) {
			return true;
		}
		
		if (!(o instanceof Person)) { //https://www.geeksforgeeks.org/overriding-equals-method-in-java/ for instanceof
			return false;
		}
		
		Person p = (Person) o;
		if (p.getName().equals(this.name) && p.getHeight() == this.height && p.getWeight() == this.weight) {
			return true;
		}	
		return false;
	}
	
	// Pretty much this whole method I learned how to write via https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
	@Override
	public int compareTo(Person JDoe) {
		if (this.name.compareTo(JDoe.name) != 0) {
			return this.name.compareTo(JDoe.name);
		}
		return 0;
	}
}
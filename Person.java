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
	
	@Override
	public String toString() {
		return String.format("%-8s %-16d %-12d", name, height, weight);
	}
	
	@Override
	public boolean equals(Object o) {
		
	}
}
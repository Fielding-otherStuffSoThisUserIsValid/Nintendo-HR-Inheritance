/*
Fielding Parsons
Use inheritance to do HR work for Nintendo
Feb 24 2025
Nintendo-HR-Inheritance
CSCI 2251 R01
*/
import java.util.ArrayList;
public class PersonSet implements PersonList {
	protected ArrayList<Person> personArrayList = new ArrayList<Person>();
	
	// This method checks to see if the ArrayList already contains the Person we're trying to add. If it doesn't, then we add the Person to the ArrayList
	@Override
	public void add(Person JDoe) {
		// System.out.println(personArrayList.contains(JDoe));//testing
		if (!personArrayList.contains(JDoe)) {
			personArrayList.add(JDoe);
		}
	}
	
	// This method returns the Person at the index entered
	@Override
	public Person get(int index) {
		return personArrayList.get(index);
	}	

	//testing
	// This method for testing prints out the ArrayList
	public void printArrayList() {
		System.out.println();
		for (int i = 0; i < personArrayList.size(); i++) {
			System.out.print(personArrayList.get(i)+"  ");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		String fullSet = "Name    Height (cm)     Weight (kg)";
		for (int i = 0; i < personArrayList.size(); i++) {
			fullSet = fullSet+"\n"+personArrayList.get(i).toString();
		}
		return fullSet;
	}
}
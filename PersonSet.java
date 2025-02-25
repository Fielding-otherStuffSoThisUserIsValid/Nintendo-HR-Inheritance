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
	
	@Override
	public void add(Person JDoe) {
		
	}
	
	@Override
	public Person get(int index) {
		return new Person(); //PLACEHOLDER CODE
	}		
}
/*
Fielding Parsons
Use inheritance to do HR work for Nintendo
March 2 2025
Nintendo-HR-Inheritance
CSCI 2251 R01
*/
import java.util.Collections;
public class PersonOrderedSet extends PersonSet {
	
	@Override
	public void add(Person JDoe) {
		super.add(JDoe);
		Collections.sort(personArrayList);
	}
}
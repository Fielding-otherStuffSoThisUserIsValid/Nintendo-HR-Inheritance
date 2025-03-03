/*
Fielding Parsons
Use inheritance to do HR work for Nintendo
March 2 2025
Nintendo-HR-Inheritance
CSCI 2251 R01
*/
public class PersonImperialSet extends PersonSet {
	
	@Override
	public void add(Person JDoe) {
		JDoe.setHeight(JDoe.getHeight() * 0.39); //https://www.rapidtables.com/convert/length/cm-to-inch.html
		JDoe.setWeight(JDoe.getWeight() * 2.20); //https://www.rapidtables.com/convert/weight/kg-to-pound.htmls
		super.add(JDoe);
	}
}
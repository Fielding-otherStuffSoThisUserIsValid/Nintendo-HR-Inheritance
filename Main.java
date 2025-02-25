/*
Fielding Parsons
Use inheritance to do HR work for Nintendo
Feb 24 2025
Nintendo-HR-Inheritance
CSCI 2251 R01
*/
/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
Composition

Q2: Color and Red are related
by which, Inheritance or Composition?
Inheritance

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
Composition

*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		
		System.out.println();
		
		Person wario = new Person(Wario, 170, 140); //https://www.reddit.com/r/Mario/comments/8iwuvv/what_are_the_main_and_some_side_characters/ for height and weight 
		PersonSet warioLandCharacters = new PersonSet();
		
		Scanner fileIn = null;
		try {
			File hrData = new File(args[0];
			fileIn = new Scanner(hrData);
		} catch (IOException e) {
			printStackTrace();
			System.exit(1);
		}
		/*
		// Don't overcomplicate the data
		// reading. After skipping the
		// first row, you can use the 
		// following to read a row of
		// character info, assuming your
		// Scanner is named "fileReader"
		String name = fileReader.next();
		double height = fileReader.nextDouble();
		double weight = fileReader.nextDouble();
		*/
		
		
		
		/*try
		{	
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}*/
		
		//testing code
		
		Person stevenBobsworth = new Person();
		System.out.println(stevenBobsworth);
		
		Person bobStevensworth = new Person();
		System.out.println(stevenBobsworth.equals(bobStevensworth));
		
		Person worthSteBobVen = new Person("Waluigi", 5000, 5000);
		System.out.println(stevenBobsworth.equals(worthSteBobVen));
		
		PersonSet stevenAndBobSet = new PersonSet();
		stevenAndBobSet.add(stevenBobsworth);
		stevenAndBobSet.add(stevenBobsworth);
		stevenAndBobSet.add(worthSteBobVen);
		stevenAndBobSet.printArrayList();
		
	}
}

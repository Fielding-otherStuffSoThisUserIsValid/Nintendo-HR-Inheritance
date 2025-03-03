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

// This method creates a new Person and a new PersonSet. Then it reads in a file and prints out all the Persons contained within.
public class Main 
{
	public static void main(String[] args) 
	{
		
		System.out.println();
		
		Person wario = new Person("Wario", 170, 140); //https://www.reddit.com/r/Mario/comments/8iwuvv/what_are_the_main_and_some_side_characters/ for height and weight of Wario
		PersonOrderedSet marioCharacters = new PersonOrderedSet();
		PersonImperialSet marioCharactersImperial = new PersonImperialSet();
		
		// Create a new scanner set to null, then in a try catch attempt to intialize the scanner properly.
		// First, check if args[0] is the name of a text file, and if it isn't, throw an IOException. If there is no args[0], an ArrayIndexOutOfBoundsException will be caught.
		// Second, make a new File, and the file contained is the one entered in args[0];
		// Third, have the scanner read in the file. if the file doesn't have anything in it, throw an IOException
		Scanner fileIn = null;
		try {
			if (args[0].endsWith(".txt")) { //Strings powerpoint from CSCI 1152 for endsWith
				File hrData = new File(args[0]);
				fileIn = new Scanner(hrData);
				if(!fileIn.hasNext()) {
					throw new IOException();
				}
			} else {
				throw new IOException();
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Either your file has no data or it is not a text file");
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Nothing has been entered in the args");
			System.exit(2);
		}
		
		fileIn.nextLine();
		while (fileIn.hasNext()) {
			String name = fileIn.next();
			int height = fileIn.nextInt();
			int weight = fileIn.nextInt();
			Person temp = new Person(name, height, weight);
			Person tempImperial = new Person(temp);
			PersonOrderedSet.add(temp);
			PersonImperialSet.add(tempImperial);
		}
		
		FileWriter fileOut = null;
		try {
		
		} catch (IOException e) {
			
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
		/*
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

		System.out.println(stevenAndBobSet);
		System.out.println();
		
		Person zach = new Person("Zacharias", 165, 100);
		Person al = new Person("Alfred", 140, 75);
		PersonOrderedSet alphabetTest = new PersonOrderedSet();
		alphabetTest.add(zach);
		alphabetTest.add(stevenBobsworth);
		alphabetTest.add(worthSteBobVen); // Starting to regret these variable names...
		alphabetTest.add(al);
		System.out.println(alphabetTest);
		System.out.println();
		stevenAndBobSet.add(al);
		System.out.println(stevenAndBobSet);
		System.out.println();
		
		Person zachImp = new Person(zach);
		Person alImp = new Person(al);
		Person stevenBobsworthImp = new Person(stevenBobsworth);
		Person worthSteBobVenImp = new Person(worthSteBobVen);
		PersonImperialSet imperialTest = new PersonImperialSet();
		imperialTest.add(zachImp);
		imperialTest.add(stevenBobsworthImp);
		imperialTest.add(worthSteBobVenImp);
		imperialTest.add(alImp);
		System.out.println(imperialTest);
		*/
	}
}

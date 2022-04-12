import java.io.*;
import java.util.*;



public class salaries
{

	public static void main(String[] args) throws IOException
	{
		// Initializing file objects
		File file1 = new File("names.txt");
		File file2 = new File ("salaries.txt");
		
		// Initializing Scanner for files
		Scanner namesFile = new Scanner(file1);
		Scanner salariesFile = new Scanner(file2);
		
		
		// initializing array size variables
		int namesCount = 0;
		int salariesCount = 0;
		
		//determining number of names in "names.txt"
		while (namesFile.hasNext()) 
		{
			namesFile.next();
			namesCount++;
		}
		// determining number of salaries in "salaries.txt
		while (salariesFile.hasNextInt())
		{
			salariesFile.nextInt();
			salariesCount++;
		}
		//reset cursor to beginning of file
		//closing file
		namesFile.close();
		salariesFile.close();
		//re-opening file
		namesFile = new Scanner(file1);
		salariesFile = new Scanner(file2);
		
		// arrays
		String namesArray[] = new String[namesCount];
		int salariesArray[] = new int[salariesCount];
		
		//check if index amounts match
		if (salariesCount != namesCount) 
		{
			System.out.println("ERROR");
		}
		// read data into arrays
		else 
		{
			for (int i = 0; i < namesCount; i++) 
			{
				namesArray[i] = namesFile.next();
			
			}
		
			for (int j = 0; j < salariesCount; j++)
			{
				salariesArray[j] = salariesFile.nextInt();
			}
		}
		
		//declaring variables to target array index
		int max = salariesArray[0];
		int location = 0;
		
		
		// find max
		for (int i = 0; i < salariesCount; i++) 
		{
			if (salariesArray[i] > max) 
			{
				max = salariesArray[i];
				location = i;
			}
			
		}
		
		//closing scanners
		namesFile.close();
		salariesFile.close();
		// print
		System.out.printf("The highest earner is %s, who earns $%,d per year.", namesArray[location], max);

	}

}

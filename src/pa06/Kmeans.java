package pa06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Kmeans{
	
	private Cluster[] clusters;
	private Cluster originalData;
	
	public Kmeans(int numClusters) {
		// initialize clusters and originalData
	}

  public void dataCheck(String fileName) throws FileNotFoundException {

      try
    {
      Scanner reader = new Scanner(new File(fileName));

      while(reader.hasNext()) {
    	  
    	  //Use reader.nextLine() to get a line of the file
    	  //Create a new Scanner(reader.nextLine) to read that line
    	  //Loop through it in another while loop, add each nextInt to an array of doubles
    	  //Create a new sample with that array, then add the sample to a cluster
    	  
      }

      reader.close();
      
    } catch(FileNotFoundException e) {
    	System.out.println("Data file not found");
    }
  }
  public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Data file name: ");
		String fileName = userInput.next();
		System.out.print("Number of clusters: ");
		int numClusters = userInput.nextInt();
		
		// create new Kmeans(numClusters) and then use dataCheck to read the data
		
	}
}

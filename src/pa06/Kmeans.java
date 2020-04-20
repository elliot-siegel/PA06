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
       String line = reader.nextLine ();
       //Create a new Scanner(reader.nextLine) to read that line
       Scanner readstring = new Scanner(line);

       //Loop through it in another while loop, add each nextInt to an array of doubles
       while(readstring.hasNext()){
         ObejctCluster[i]= readstring.nextLine();
         i++;
         //Create a new sample with that array, then add the sample to a cluster
         Cluster.add(ObejctCluster);
       }

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
   private List points;
   private List clusters;

   public KMeans() {
     this.points = new ArrayList();
     this.clusters = new ArrayList();
   }

   public static void main(String[] args) {

     KMeans kmeans = new KMeans();
     kmeans.origin();
     kmeans.calculate();
   }
}

 }
}

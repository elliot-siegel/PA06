package pa06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Kmeans{

  private Cluster[] clusters;
  private Cluster originalData;
  private int dimension;

  public Kmeans(int numClusters, int dimension) {
	  this.clusters = new Cluster[numClusters];
	  this.originalData = new Cluster();
	  Sample s = new Sample();

	  //add 0's to the first sample according to the dimension of the data
	  for (int i = 0; i < dimension; i++) s.addValue(0);
	  this.originalData.addSample(s);

	  this.dimension = dimension;
  }

  public void dataCheck(String fileName) throws FileNotFoundException {

     try
   {
     Scanner reader = new Scanner(new File(fileName));

     while(reader.hasNext()) {

    	 Sample objectCluster = new Sample();

    	 for (int i = 0; i < dimension; i++) objectCluster.addValue(reader.nextDouble());

    	 originalData.addSample(objectCluster);

     }

     reader.close();

   } catch(FileNotFoundException e) {
     System.out.println("Data file not found");
   }
 }

 public static void main(String[] args) {
   Scanner userInput = new Scanner(System.in);
   System.out.println("Data file name: ");
   String fileName = userInput.next();
   System.out.println("Number of clusters: ");
   int numClusters = userInput.nextInt();
   System.out.println("Dimension of the data set: ");
   int dimension = userInput.nextInt();

   // create new Kmeans(numClusters) and then use dataCheck to read the data
   Kmeans kmeans = new Kmeans(numClusters, dimension);

   try {
	   kmeans.dataCheck(fileName);
   } catch(FileNotFoundException e) {
	   System.out.println("Data file not found");
   }

 }

   //step 6
   	/**
   	 *
   	 * @param points an array of clusters (probably the clusters variable)
   	 * @param k a sample point
   	 * @return the cluster whose sample point is closest to k
   	 */
      public static Cluster closestSample(Cluster[] points, Sample k) {

   	   	int n = points.length;
   	   	double closest = k.distance(points[0].getClusterPt());
   	   	Cluster ans = points[0];

   	   	for (int i = 1; i < n; i++) {
   	   		if (k.distance(points[i].getClusterPt()) < closest) {
   	   			ans = points[i];
   	   		}
   	   	}

   	   	return ans;

       }
       //step 7
       public void reclassify(){
         for(int m = 1; m < originalData.length; m++){
          Cluster C =  closestSample(clusters, originalData.getSample[m]);
          C.addSample(originalData.getSample[m]);
         }    
       }
}

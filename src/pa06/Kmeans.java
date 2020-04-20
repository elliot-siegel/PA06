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
}
   //public static void main(String[] args) {

     //KMeans kmeans = new KMeans();
     //kmeans.origin();
     //kmeans.calculate();
   //}

   //sample/cluster
//step 6
   public int[][] Closestsample(int[][] points, int K) {
        int N = points.length;
        int[] distance = new int[N];
        for (int i = 0; i < N; ++i)
            distance[i] = dist(points[i]);

        Arrays.sort(distance);
        int distanceofK = distance[K-1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < N; ++i)
            if (dist(points[i]) <= distanceofK)
                ans[t++] = points[i];
        return ans;
    }    
    public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}

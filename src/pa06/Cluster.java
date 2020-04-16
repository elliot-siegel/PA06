package pa06;

import java.util.Random;
import java.util.ArrayList;

public class Cluster {
	
	private ArrayList<Sample> samples;
	private Sample clusterPt;
	
	public Cluster() {
		samples = new ArrayList<Sample>();
	}
	
	public void addSample(Sample s) {
		this.samples.add(s);
	}
	
	public void getRandomPt() {
		Random rand = new Random();
		int index = rand.nextInt(this.samples.size() - 1);
		Sample s = this.samples.get(index);
		this.clusterPt = s;
	}
	
	public void printCluster() {
		System.out.println("Samples in cluster:");
		for(int i=0; i<samples.size(); i++) {
			System.out.println(samples.get(i));
		}
	}
	
	public Sample getClusterPt(){
		return this.clusterPt;
	}
}

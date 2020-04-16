package pa06;

import java.util.Random;
import java.util.ArrayList;

public class Cluster {
	
	private ArrayList<Sample> samples;
	private Sample clusterPt;
	
	public Cluster() {
		samples = new ArrayList<Sample>();
	}
	
	public Cluster(Sample clusterPt) {
		samples = new ArrayList<Sample>();
		this.clusterPt = clusterPt;
	}
	
	public void addSample(Sample s) {
		this.samples.add(s);
	}
	
	public Sample getRandomPt() {
		Random rand = new Random();
		int index = rand.nextInt(this.samples.size() - 1);
		return this.samples.get(index);
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

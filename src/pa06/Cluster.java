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

	public int length() {
		return samples.size();
	}

	public Sample getSample(int i) {
		return samples.get(i);
	}
	public Sample average(){
		Sample averagesample = new Sample();
		for(int m = 0; m <sample(0).length, m++){
			double average = 0;
		for(int n =0; n<samples.size(); n++){
			average = (average + samples[n][m]);
		}
		average = average/samples.size;
		averagesample.add(average);
	}
	return averagesample;
	}
}

package pa06;

import java.util.Random;
import java.util.ArrayList;

public class Cluster {
	
	ArrayList<Sample> samples;
	Sample clusterPt;
	
	public Cluster() {
		samples = new ArrayList<Sample>();
	}
	
	public void addSample(Sample s) {
		this.samples.add(s);
	}
	
	public Sample getRandomPt() {
		Random rand = new Random();
		int index = rand.nextInt(this.samples.size() - 1);
		Sample s = this.samples.get(index);
		this.clusterPt = s;
		return s;
	}
}

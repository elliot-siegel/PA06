package pa06;

import java.util.ArrayList;

/**
 * A Sample represents a vector of doubles to be used in a clustering algorithm...
 * @author presenting
 *
 */

public class Sample {
	ArrayList<Double> sample;

	public Sample(double[] values) {
		this.sample = new ArrayList<Double>();
		for (int i=0; i<values.length; i++) {
			sample.add(values[i]);
		}

	}
	
	/** 
	 * dimension and find distance
	 */
	
	public double distance(Sample s) {
		if (this.sample.size() == s.sample.size()) {
			Double sum = 0D;
			for (int i = 0; i < this.sample.size(); i++) {
				double tmp = this.sample.get(i) - s.sample.get(i);
				sum = sum + tmp * tmp;
			}
			return Math.sqrt(sum);
		}
		else {
			throw new ArithmeticException("Exception in Euclidean distance: array lengths are not equal");
		}
	}
	
	public String toString() {
		return this.sample.toString();
	}

}

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


	public static void main(String[] args) {
		System.out.println("testing for the Sample class.");
		double[] p1 = {2, 2};
		double[] p2 = {0, 0};
		Sample s1 = new Sample(p1);
		Sample s2 = new Sample(p2);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		double value = s2.distance(s1);
		System.out.println(value);

		}

}

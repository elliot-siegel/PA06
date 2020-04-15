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

	public static void main(String[] args) {
		System.out.println("testing for the Sample class.");
		double[] p1 = {1d, 2d, 3.14, 2.71};
		double[] p2 = {0.1, 1.1, 2.1, 3.1};
		Sample s1 = new Sample(p1);
		Sample s2 = new Sample(p2);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

		/** dimension and find distance
*/
		public double distance(double[] p1, double[] p2) throws Exception {
				if (p1.length == p2.length) {
					Double sum = 0D;
					for (int i = 0; i < p1.length; i++) {
						double tmp = p2[i] - p1[i];
						sum = sum + tmp * tmp;
					}
					return sum;
				}
				else {
					throw new Exception("Exception in Euclidean distance: array lengths are not equal");
				}
			}

		}

}
/** You seemed leave.So I left the meeting~ I don't know whether this is correct.
please help me check it!
*/

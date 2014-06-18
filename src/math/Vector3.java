package math;

public class Vector3 {

	public double x;
	public double y;
	public double z;
	
	/**
	 * Millington explains this is padding to ensure a 4 word alignment in some systems
	 */
	private double pad;
	
	/**
	 * Default Constructor
	 */
	public Vector3() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	/**
	 * Build constructor
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Returns the magnitude of the vector
	 * @return magnitude of the vector
	 */
	public double magnitude() {
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	/**
	 * Convenience method for the square of the magnitude
	 * @return Essentially magnitude squared
	 */
	public double squareMagnitude() {
		return x*x + y*y + z*z;
	}
	
}

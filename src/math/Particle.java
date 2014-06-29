package math;

public class Particle {

	/**
	 * Position and motion variables.
	 */
	Vector3 position;
	Vector3 velocity;
	Vector3 acceleration;
	
	/**
	 * Millington's rough approximation of drag. Page 49.
	 */
	Double damping;
	
	/**
	 * Inverse mass is more convenient since it is better
	 * to have objects with immovable infinite mass than
	 * zero mass. 
	 */
	Double inverseMass;
	
}

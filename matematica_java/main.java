public class main {
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = Math.hypot(x, y);
		double A, B;
		double delta;

		A = Math.sqrt(x);
		B = Math.pow(x, z);
		delta = Math.pow(A, 2) - 4*A*z;
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		System.out.println("Z: " + z);
		System.out.println("Delta: " + delta);
	}
}
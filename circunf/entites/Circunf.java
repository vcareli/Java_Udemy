package entites;

public class Circunf {
	public static double area(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public static double comprimento(double radius) {
		return 2 * Math.PI * radius;
	}

	public static double volume(double radius) {
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}
}

/*public class Circunf {
	public double raio;

	public double area(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public double comprimento(double radius) {
		return 2 * Math.PI * radius;
	}

	public double volume(double radius) {
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}

	public String toString() {
		return "Area: " + String.format("%.2f", area(raio)) + 
			   "\nComprimento: " + String.format("%.2f", comprimento(raio)) + 
			   "\nVolume: " + String.format("%.2f", volume(raio));
	}
}*/
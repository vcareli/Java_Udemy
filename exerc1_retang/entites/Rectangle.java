package entites;

public class Rectangle{
	public double larg;
	public double haut;

	public double area() {
		return larg * haut;
	}

	public double perimeter() {
		return (2*haut) + (2*larg);
	}

	public double diagonal() {
		return Math.sqrt((larg*larg)+(haut*haut));
	}
}
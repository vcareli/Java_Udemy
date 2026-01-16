import java.util.Locale;
import java.util.Scanner;
import entites.Circunf;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio;
		System.out.print("Digite o raio da circunferencia: ");
		raio = sc.nextDouble();
		System.out.printf("Adotamos PI: %.3f%n", Math.PI);
		System.out.println("Circunf e Esfera: ");
		System.out.println("Area: " + String.format("%.2f", Circunf.area(raio)) + 
			   "\nComprimento: " + String.format("%.2f", Circunf.comprimento(raio)) + 
			   "\nVolume: " + String.format("%.2f", Circunf.volume(raio)));
		sc.close();
	}
}

/*public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Circunf c = new Circunf();
		System.out.println("Digite o raio da circunferencia:");
		c.raio = sc.nextDouble();
		System.out.printf("Adotamos PI: %.3f%n", Math.PI);
		System.out.println("Circunf e Esfera: " + c);
		sc.close();
	}
}*/
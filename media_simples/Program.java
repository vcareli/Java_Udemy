import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantas pessoas na lista: ");
		int i;
		double media = 0;
		int loops = scanner.nextInt();
		double[] altura = new double[loops];
		for (i = 0; i < loops; i++) {
			System.out.println("Altura: ");
			altura[i] = scanner.nextDouble();
			media += altura[i];
		}
		media /= loops;
		System.out.printf("Altura media: %.2f%n", media);
		scanner.close();
	}
}
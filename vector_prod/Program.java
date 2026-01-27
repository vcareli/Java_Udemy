import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Quantos produtos deseja cadastrar? ");
		int q = sc.nextInt();
		Product[] produtos = new Product[q];
		double total = 0;
		System.out.println("Digite os nome dos produtos: ");
		for (int i = 0; i < produtos.length; i++) {
			sc.nextLine();
			String name = sc.next();
			double price = sc.nextDouble();
			produtos[i] = new Product(name, price);
			total += produtos[i].getPrice();
		}
		System.out.printf("Media dos preços: $ %.2f%n", (total / produtos.length));
		sc.close();
	}
}
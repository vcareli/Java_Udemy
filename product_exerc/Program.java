import java.util.Locale;
import java.util.Scanner;
import entites.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product produto = new Product();
		
		System.out.println("Dados do produto:");
		System.out.print("Produto: ");
		produto.name = sc.nextLine();
		System.out.print("Quantidade: ");
		produto.quantity = sc.nextInt();
		System.out.print("Preço: ");
		produto.price = sc.nextDouble();
		System.out.println("Inf. prog.: " + produto);
		
		System.out.print("Adicionar produtos no estoque: ");
		int qtd = sc.nextInt();
		produto.AddProducts(qtd);
		System.out.println("Inf. prog.: " + produto);
		System.out.print("Remover produtos no estoque: ");
		qtd = sc.nextInt();
		produto.RemoveProducts(qtd);
		System.out.println("Inf. prog.: " + produto);
		sc.close();
	}
}
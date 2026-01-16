import java.util.Locale;
import java.util.Scanner;
import entites.Converter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor, cotacao;
		System.out.print("Digite o valor do dolar na cotacao de hoje: R$");
		cotacao = sc.nextDouble();
		System.out.print("Digite a quantidade de dolares que voce vai comprar: $");
		valor = sc.nextDouble();
		System.out.printf("Valor total a pagar: R$%.2f%n", Converter.dollarToReal(valor, cotacao,0.06) );
		sc.close();
	}
}
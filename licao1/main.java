import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IO.println("Hello, World!");
		System.out.print("--Hello, ");
		IO.println("World!");
		int x = 32;
		char letra;
		double y = 3.145352464553;
		String nome = "Maria";
		IO.println("The value of x is: " + x);
		IO.println("The value of y is: " + y);
		IO.print("The value of y is: ");
		System.out.printf("%.2f%n", y);
		IO.print("The value of y is: ");
		System.out.printf("%.4f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", y);
		System.out.printf("Medida %.4f metros.%n", y);
		System.out.printf("%s tem %d anos e mede %.2f metros%n", nome, x, y);
		/*
			%f - ponto flutuante
			%d - inteiro
			%s - string
				10 - espaço reservado para 10 caracteres
				.2 - duas casas decimais
				0  - preenche com zeros à esquerda
				10.2 - espaço reservado para 10 caracteres, com 2 casas decimais
				%n - quebra de linha
		*/
		/*IO.print("Digite seu nome: ");
		String a = scanner.next();
		IO.print("Digite sua altura: ");
		Double metros = scanner.nextDouble();
		System.out.printf("%s voce tem %.2f metros.%n", a, metros);
		IO.print("Digite uma letra: ");
		letra = scanner.next().charAt(0);
		System.out.println("Sua letra foi: " + letra);
		String x;
		int y;
		double z;
		x = scanner.next();
		y = scanner.nextInt();
		z = scanner.nextDouble();
		System.out.println("Voce digitou:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int a;
		String l1, l2, l3;
		
		a = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha pendente
		l1 = scanner.nextLine();
		l2 = scanner.nextLine();
		l3 = scanner.nextLine();
		System.out.println("Voce digitou:");
		System.out.println(a);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);*/
		scanner.close();
	}
}
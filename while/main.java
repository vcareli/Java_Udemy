import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, soma = 0;
		IO.println("Digite números inteiros (0 para terminar): ");
		num = scanner.nextInt();
		while (num !=0) {
			soma += num;
			num = scanner.nextInt();
		}
		IO.println("Soma: " + soma);
		scanner.close();
	}
}
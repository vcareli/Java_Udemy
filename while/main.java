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

/*
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		IO.println("Digite números inteiros (0 para terminar): ");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++){
			soma += num;
			num = scanner.nextInt();
		}
		IO.println("Soma: " + soma);
		scanner.close();
	}
}
*/
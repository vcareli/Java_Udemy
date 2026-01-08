import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double valor_final = 50.0 ;
        Double prix_tempo_exc = 2.0;
        int tempo = 100;

        System.out.print("Quanto tempo voce utilizou? (em minutos): ");
        int tempo_user = scanner.nextInt();
        if (tempo_user > tempo) {
            valor_final += (tempo_user - tempo) * prix_tempo_exc;
        }
        System.out.printf("O valor final a pagar e: R$ %.2f%n", valor_final);
        scanner.close();
        /*
        Double preco = 35;
        Double desc = (preco < 20) ? preco * 0.1 : preco * 0.05;
        */
	}
}
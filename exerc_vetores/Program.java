import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores cada vetor? ");
		int q = sc.nextInt();
		int vetor[] = new int[q];
		double soma = 0;
		System.out.println("Digite o valor da posicao:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		System.out.printf("Media dos valores: %.2f%n", media);
		System.out.println();
		System.out.print("Elementos abaixo da media: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.print(vetor[i] + " ");
			}
		}
		sc.close();
	}
}

/*public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores cada vetor? ");
		int q = sc.nextInt();
		int vetor1[] = new int[q];
		int vetor2[] = new int[q];
		int vetor_soma[] = new int[q];
		System.out.println("Digite os valor do vetor A: ");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = sc.nextInt();
			vetor_soma[i] += vetor1[i];
		}
		System.out.println("Digite os valor do vetor B: ");
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = sc.nextInt();
			vetor_soma[i] += vetor2[i];
		}
		System.out.print("Vetor C (soma dos vetores): ");
		for (int i = 0; i < vetor_soma.length; i++) {
			System.out.print(vetor_soma[i] + " ");
		}
		sc.close();
	}
}

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros verificar? ");
		int q = sc.nextInt();
		int numeros[] = new int[q];
		int maior = 0;
		int pos = 0;
		System.out.println("Digite um numero ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
			if (maior <= numeros[i]){
				maior = numeros[i];
				pos = i + 1;
			}
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Posicao: " + pos);
		sc.close();
	}
}

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros verificar? ");
		int q = sc.nextInt();
		int numeros[] = new int[q];
		System.out.println("Digite um numero ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		System.out.print("Pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Impares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		sc.close();
	}
}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos pessoas deseja analisar? ");
		int q = sc.nextInt();
		String nomes[] = new String[q];
		int idades[] = new int[q];
		double alturas[] = new double[q];
		double soma_alturas = 0.0;
		int count = 0;
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite o nome, idade e altura da pessoa " + (i + 1) + ":");
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
			soma_alturas += alturas[i];
			if (idades[i] < 16){
				count++;
			}
		}
		System.out.printf("Altura media: %.2f%n", soma_alturas / q);
		System.out.printf("Pessoas com menos de 16 anos: %d %% %n", (count*100/idades.length));
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}
}

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros deseja somar e obter media? ");
		int q = sc.nextInt();
		double sum = 0;
		double numeros[] = new double[q];
		System.out.println("Digite um numero ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
			sum += numeros[i];
		}
		System.out.print("Numeros : ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
			if (i < numeros.length - 1) {
				System.out.print("; ");
			}
		}
		System.out.println();
		System.out.printf("Soma: %.2f%n", sum);
		System.out.printf("Media: %.2f%n", sum / numeros.length);
		sc.close();
	}
}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros deseja analisar? ");
		int q = sc.nextInt();
		int numeros[] = new int[q];
		System.out.println("Digite um numero ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		System.out.println("Numeros negativos: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		sc.close();
	}
}*/
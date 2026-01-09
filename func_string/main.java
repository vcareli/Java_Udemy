import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String original = "Exemplo de String em Java";
		String[] vetor = original.split( " ");



		System.out.println("Original: " + original);
		System.out.println("Maiúsculas: " + original.toUpperCase());
		System.out.println("Minúsculas: " + original.toLowerCase());
		System.out.println("Tamanho: " + original.length());
		System.out.println("Substituir 'Java' por 'Python': " + original.replace("Java", "Python"));
		System.out.println("Índice de 'de': " + original.indexOf("S"));
		System.out.println("Substring (7, 17): " + original.substring(7, 17));
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);
	}
}
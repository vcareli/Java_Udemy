import java.util.Locale;
import java.util.Scanner;
import entites.Aluno;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno:");
		aluno.nome = sc.nextLine();
		System.out.println("Digite as tres notas do aluno:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		System.out.println("NOTA FINAL = " + String.format("%.2f", aluno.calcularNotaFinal()));
		System.out.println(aluno.verifica());
		sc.close();
	}
}
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite n <Matriz quadrada n x n>: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println(" -- Digite os " + (n*n) + " valores --");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Main Diagonal: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		sc.close();
	}
}

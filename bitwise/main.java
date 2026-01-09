import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int mask = 32;
		// int mask 0b100000; 32 em binario tem o sexto bit VERDADEIRO

		if ((a & mask) != 0) {
			System.out.println("6th bit is TRUE");
		} else {
			System.out.println("6th bit is FALSE");
		}
		scanner.close();		
	}
}
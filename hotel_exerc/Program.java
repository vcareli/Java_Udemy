import java.util.Scanner;
import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		System.out.println("Quartos deseja cadastrar?");
		int q = sc.nextInt();
		for (int i = 1; i <= q; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int r = sc.nextInt();
			vect[r] = new Rent(name, email);
		}
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null){
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}
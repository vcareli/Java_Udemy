import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client;
		System.out.println("Enter account data:");
		System.out.print("Name: ");
		String name_client = sc.nextLine();
		System.out.print("Account number: ");
		int count = sc.nextInt();
		System.out.print("Is there an initial deposit (y/n)? ");
		//Client client = new Client(name_client, count);
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial_deposit = sc.nextDouble();
			client = new Client(name_client, count, initial_deposit);
		}
		else {
			client = new Client(name_client, count);
			System.out.println("Account created without initial deposit.");
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", client.getCount_number(), client.getName(), client.getBalance());
		System.out.println("Enter a deposit value: ");
		double deposit_value = sc.nextDouble();
		client.deposit(deposit_value);
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", client.getCount_number(), client.getName(), client.getBalance());
		System.out.println("Enter a withdraw value: ");
		double withdraw_value = sc.nextDouble();
		client.withdraw(withdraw_value);
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", client.getCount_number(), client.getName(), client.getBalance());		
		sc.close();
	}
}
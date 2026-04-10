import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import entities.List_employee;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List_employee employee = new List_employee();
		int id = 0;
		int incrase = 0;
		Double salaire = 0.0;
		String nom;
		System.out.print("Quantos funcionarios deseja cadastrar? ");
		int cad = sc.nextInt();
		for (int i = 0; i < cad; i++) {
			System.out.println("Funcionario n. " + (i+1));
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nom: ");
			nom = sc.nextLine();
			System.out.print("Salaire: ");
			salaire = sc.nextDouble();
			while (!employee.setEmployee(new Employee(id, nom, salaire))){
				System.out.println("Id ja existe...");
				System.out.print("Id: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Nom: ");
				nom = sc.nextLine();
				System.out.print("Salaire: ");
				salaire = sc.nextDouble();
			}
			System.out.println();
		}
		System.out.print("Id do funcionario que deseja dar aumento: ");
		id = sc.nextInt();
		System.out.print("% de aumento: ");
		incrase = sc.nextInt();
		while (!employee.changer_salaire(id, incrase)) {
			System.out.print("Id nao encontrado! Digite outro: ");
			System.out.print("Id do funcionario que deseja dar aumento: ");
			id = sc.nextInt();
			System.out.print("% de aumento: ");
			incrase = sc.nextInt();
		}
		System.out.println("Liste des emploies:");
		for (Employee f: employee.getEmployee()) {
			System.out.println(f.getId() + ", " + f.getName() + ", " + f.getSalaire());
		}
		sc.close();
	}
}

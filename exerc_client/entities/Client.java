package entities;

public class Client {
	private String name;
	private int count_number;
	private double balance;

	public Client(){
	}

	public Client(String name, int count_number, double balance) {
		this.name = name;
		this.count_number = count_number;
		deposit(balance);
	}

	public Client(String name, int count_number) {
		this.name = name;
		this.count_number = count_number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCount_number() {
		return count_number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
}
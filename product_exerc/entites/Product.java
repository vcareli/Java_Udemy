package entites;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", R$ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unidade(s), valor total R$ "
				+ String.format("%.2f", TotalValueInStock());
	}
}

package entites;

public class Converter {
	public static double dollarToReal(double dollar, double exchangeRate, double feePercentage) {
		double totalInReais = dollar * exchangeRate;
		double fee = totalInReais * feePercentage;
		return totalInReais + fee;
	}
}
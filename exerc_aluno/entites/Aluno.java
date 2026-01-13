package entites;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double calcularNotaFinal() {
		return nota1 + nota2 + nota3;
	}

	public String verifica() {
		if (calcularNotaFinal() >= 60.0) {
			return "APROVADO";
		} else {
			double faltante = 60.0 - calcularNotaFinal();
			return "REPROVADO\nFALTARAM " + String.format("%.2f", faltante) + " PONTOS";
		}
	}
}
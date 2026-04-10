package entities;

public class Employee {
	private int id;
	private String name;
	private double salaire;
	
	public Employee() {
	}

	public Employee(int id, String name, double salaire){
		this.id = id;
		this.name = name;
		this.salaire = salaire;
	}

	//setters
	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSalaire(int percent){
		this.salaire = (salaire+(salaire*percent/100));
	}

	//getters
	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public double getSalaire(){
		return salaire;
	}
}

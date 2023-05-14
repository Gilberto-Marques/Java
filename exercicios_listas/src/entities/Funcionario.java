package entities;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.name = nome;
		this.salary = salario;
	}
	
	public void increaseSalary(double porcento) {
		
		salary = (porcento * salary / 100) + salary; 
	}
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return name;
	}
	
	public Double getSalario() {
		return salary;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
}

package entities;

public abstract class Person {

	private String name;
	private Double rendaAnual;

	public Person() {
	}

	public Person(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract Double valorImposto();

	@Override
	public String toString() {
		return name + " $ " + String.format("%.2f", valorImposto());
	}
}

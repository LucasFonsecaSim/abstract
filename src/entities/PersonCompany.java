package entities;

public class PersonCompany extends Person {

	private Double numeroFuncionario;

	public PersonCompany() {
	}

	public PersonCompany(String name, Double rendaAnual, Double numeroFuncionario) {
		super(name, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Double getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Double numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public Double valorImposto() {
		if (numeroFuncionario < 10) {
			return getRendaAnual() * 0.16;
		} else {
			return getRendaAnual() * 0.14;
		}
	}

}

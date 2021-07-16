package entities;

public class PersonIndividual extends Person {

	private Double gastosSaude;

	public PersonIndividual() {
	}

	public PersonIndividual(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double valorImposto() {
		if (getRendaAnual() < 20000.00) {
			return (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
		} else {
			return (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
		}
	}
}

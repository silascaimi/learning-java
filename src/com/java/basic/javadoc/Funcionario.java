package com.java.basic.javadoc;

/**
 * Representa um funcionario da empresa
 * 
 * @author Silas
 *
 */
public class Funcionario {

	private String nome;
	private double salario;

	/**
	 * Não utilize mais, pois o salário é obrigat�rio para outros métodos
	 * 
	 * @deprecated
	 * @param nome Recebe o nome do funcionario
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Calcula o adiantamento em dinheiro que deverá ser pago ao funcion�rio.
	 * 
	 * <p>
	 * O valor da diária � calculado dividindo-se o <b>salário base por 30 (dias do
	 * mês)</b>.
	 * </p>
	 * 
	 * Caso o destino for uma capital, será adicionado 20% no valor do adiantamento.
	 * 
	 * @param dias    Quantidade de dias da viagem
	 * 
	 * @param capital Indica se � ou n�o uma capital brasileira
	 * 
	 * @throws IllegalArgumentException Caso {@code dias} for menor ou igual a zero
	 * 
	 * @return O valor em reais do adiantamento
	 * 
	 * @since 1.0.0
	 * 
	 * @see Viagem
	 * 
	 */
	public double adiantamentoViagem(int dias, boolean capital) {

		if (dias <= 0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero");
		}

		double valorDiaria = salario / 30;

		double valorAdiantamento = valorDiaria * dias;

		if (capital) {
			valorAdiantamento *= 1.20;
		}

		return valorAdiantamento;
	}
}

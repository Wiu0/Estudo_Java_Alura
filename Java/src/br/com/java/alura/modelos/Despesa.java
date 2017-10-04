package br.com.java.alura.modelos;

/**
 * Entidade para representacao de uma despesa
 * @author wiu
 *
 */
public class Despesa extends DespesaModelo{

	private String descricao;
	private double valorMaximo;
	
	public Despesa(int codigo, String descricao, double valorMaximo) {
		super(codigo);
		this.descricao = descricao;
		this.valorMaximo = valorMaximo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
}

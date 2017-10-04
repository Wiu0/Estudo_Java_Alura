package br.com.java.alura.modelos;

/**
 * Entidade para representacao de uma despesa
 * 
 * @author wiu
 *
 */
public class DespesaAplicada extends DespesaModelo implements Comparable<DespesaAplicada> {

	private double valor;

	public DespesaAplicada(int codigo, double valor) {
		super(codigo);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "COD: " + String.format("%1$03d", getCodigo()) + " VAL: " + String.format("%4.2f", getValor());
	}

	@Override
	public int compareTo(DespesaAplicada o) {
		return this.getCodigo() < o.getCodigo() ? -1 : this.getCodigo() > o.getCodigo() ? 1 : 0;
	}

}

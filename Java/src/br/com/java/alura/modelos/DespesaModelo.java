package br.com.java.alura.modelos;

/**
 * Abstracao para representacao de uma despesa
 * @author wiu
 *
 */
public abstract class DespesaModelo {

	private int codigo;
	
	public DespesaModelo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}

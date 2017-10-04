package br.com.java.alura.list;

/**
 * Classe RDV(Reembolso de viagem). Tem como conceito manter os dados de gastos durante uma "viagem"
 * @author wiu
 */
public class RDV {

	private ListaDespesaAplicavel despesas;
	
	public RDV() {
		despesas = new ListaDespesaAplicavel();
	}
	
	public ListaDespesaAplicavel getListaDepesas() {
		return despesas;
	}
	

}

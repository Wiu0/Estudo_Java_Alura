package br.com.java.alura.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.java.alura.modelos.DespesaAplicada;

public class ListaDespesaAplicavel {

	private int qtdTotal;
	private double valorTotal;
	private List<DespesaAplicada> despesas;
	
	public ListaDespesaAplicavel() {
		despesas = new LinkedList<DespesaAplicada>();
	}
	
	public void addDespesa(DespesaAplicada d) {
		valorTotal += d.getValor();
		qtdTotal++;
		despesas.add(d);
	}
	
	public List<DespesaAplicada> getDespesas(){
		return Collections.unmodifiableList(despesas);
	}

	public int getQtdTotal() {
		return qtdTotal;
	}

	public void setQtdTotal(int qtdTotal) {
		this.qtdTotal = qtdTotal;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}

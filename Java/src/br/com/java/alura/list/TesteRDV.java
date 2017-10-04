package br.com.java.alura.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.java.alura.modelos.DespesaAplicada;

public class TesteRDV {

	public static void main(String[] args) {
		RDV r = new RDV();
	
		r.getListaDepesas().addDespesa(new DespesaAplicada(1, 23.66));
		r.getListaDepesas().addDespesa(new DespesaAplicada(4, 55));
		r.getListaDepesas().addDespesa(new DespesaAplicada(2, 3));
	
		System.out.println("Despesas\nValor total\tQuantidade Total");
		System.out.print(String.format("%1$03d", r.getListaDepesas().getQtdTotal()) + "\t\t");
		System.out.println(String.format("%4.2f", r.getListaDepesas().getValorTotal()) + "\n");
		
		//Representacao da lista de uma forma nao agradavel
		//System.out.println(r.getListaDepesas().getDespesas());
		System.out.println("LISTA ORDEM ORIGINAL\nCOD\t\tVAL");
		r.getListaDepesas().getDespesas().forEach(despesa ->{
			System.out.print(String.format("%1$03d", despesa.getCodigo()) + "\t\t");
			System.out.println(String.format("%4.2f", despesa.getValor()));
		});
		
		List<DespesaAplicada> d = new LinkedList<DespesaAplicada>(r.getListaDepesas().getDespesas());
		
		Collections.sort(d);
		System.out.println("\nLISTA ORDEM COD ASC\nCOD\t\tVAL");
		d.forEach(despesa ->{
			System.out.print(String.format("%1$03d", despesa.getCodigo()) + "\t\t");
			System.out.println(String.format("%4.2f", despesa.getValor()));
		});
		
		
	}
	
}

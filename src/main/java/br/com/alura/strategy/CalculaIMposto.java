package br.com.alura.strategy;

public class CalculaIMposto {

	public void calculaTaxa(Orcamento orcamento, Imposto imposto){
		System.out.println(imposto.calcula(orcamento));
	}
}

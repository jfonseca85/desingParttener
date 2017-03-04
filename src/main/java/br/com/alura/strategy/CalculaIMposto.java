package br.com.alura.strategy;

public class CalculaIMposto {
	private Orcamento orcamento;
	private Imposto imposto;

	public CalculaIMposto(Orcamento orcamento, Imposto imposto){
		this.orcamento = orcamento;
		this.imposto = imposto;
		
	}
	
	public void calculaTaxa(){
		System.out.println(this.imposto.calcula(orcamento));
	}
}

package br.com.alura.strategy;

public class TestaImpostoICCC {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		Imposto iccc = new ICCC();
		
		CalculaIMposto calculaIMposto = new CalculaIMposto();
		calculaIMposto.calculaTaxa(orcamento, iccc);

	}

}

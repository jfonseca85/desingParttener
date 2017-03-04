package br.com.alura.strategy;

public class TesteCalculaImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		Imposto icms = new ICMS();
		CalculaIMposto calculaIMposto = new CalculaIMposto(orcamento, icms);
		calculaIMposto.calculaTaxa();

	}

}

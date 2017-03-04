package br.com.alura.strategy;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double result = 0;
		if (orcamento.getValor() < 1000) {
			result = orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() <= 3000) {
			result = orcamento.getValor() * 0.07;
		} else {
			result = orcamento.getValor() * 0.08 + 30;
		}
		return result;

	}

}

package br.com.alura.strategy.investimento;

public class InvestidorArrojado implements Investimento {

	@Override
	public double calcula(Conta conta) {
		double result = new java.util.Random().nextDouble();
		if (result <= 0.2) {
			return conta.getSaldo() * 0.05;
		} else if (result <= 0.3) {
			return conta.getSaldo() * 0.03;
		} else {
			return conta.getSaldo() * 0.006;
		}

	}

}

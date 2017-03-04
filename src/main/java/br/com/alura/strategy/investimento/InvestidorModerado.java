package br.com.alura.strategy.investimento;


public class InvestidorModerado implements Investimento {

	@Override
	public double calcula(Conta conta) {
		Boolean result = new java.util.Random().nextDouble() > 0.50;
		if (result) {
			return conta.getSaldo() * 0.025;//
		} else {
			return conta.getSaldo() * 0.007;
		}
	}
}

package br.com.alura.strategy.investimento;

public class RealizadorInvestimentos {
	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);
		conta.deposito(resultado * 0.75);
	}
}

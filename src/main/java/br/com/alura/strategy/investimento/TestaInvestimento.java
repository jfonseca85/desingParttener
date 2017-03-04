package br.com.alura.strategy.investimento;

public class TestaInvestimento {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposito(500);

		System.out.println("Novo saldo : " + conta.getSaldo());
		
		Investimento moderado = new InvestidorModerado();
		RealizadorInvestimentos realizadorInvestimentos = new RealizadorInvestimentos();
		realizadorInvestimentos.realiza(conta, moderado);
		System.out.println("saldo depois do Investimento : "+ conta.getSaldo());
		
		
	}

}

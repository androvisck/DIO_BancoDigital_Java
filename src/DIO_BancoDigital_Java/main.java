package DIO_BancoDigital_Java;

public class main {
	public static void main(String[] args) {
		Cliente androvisck = new Cliente();
		androvisck.setNome("androvisck");
		
		Conta cc = new ContaCorrente(androvisck);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(androvisck);
		
		cc.transferir(75, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.sacar(10);
		poupanca.sacar(15);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}

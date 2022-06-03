
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(null);
		Conta poupanca = new ContaPoupanca(null);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.ImprimirDadosConta();
		poupanca.ImprimirDadosConta();
	}

}

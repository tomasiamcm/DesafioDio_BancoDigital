
public abstract class Conta implements InterfaceConta {
	
	private static final int BANCO_PADRAO = 001;
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int numBanco;
	protected int numAgencia;
	protected int numConta;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.numBanco = Conta.BANCO_PADRAO;
		this.numAgencia = Conta.AGENCIA_PADRAO;
		this.numConta = Conta.SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getNumBanco() {
		return numBanco;
	}
	
	public int getNumAgencia() {
		return numAgencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void ImprimirDadosConta() {
		System.out.println(this.numBanco);
		System.out.println(this.numAgencia);
		System.out.println(this.numConta);
		System.out.println(this.saldo);
	}
	
}

	


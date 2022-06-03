import java.util.List;

public class Banco {
	
	public int numBanco;
	public String nome;

	private List<Conta> contas;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;	
	}
	
	public int getNumBanco() {
		return numBanco;
	}

	public void setNumBanco(int numBanco) {
		this.numBanco = numBanco;
	}
}

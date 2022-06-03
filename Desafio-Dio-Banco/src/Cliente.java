
public class Cliente {

	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 1;
	
	public enum TipoCliente {FISICA, JURIDICA}
	
	public String nome;
	private String documentoFiscal;
	public Cliente.TipoCliente tipoCliente;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDocumentoFiscal() {
		return documentoFiscal;
	}

	public void setDocumentoFiscal(String documentoFiscal) {
		if(documentoFiscal == null || documentoFiscal.isEmpty()) {
			throw new RuntimeException("Documento nao pode ser nulo ou vazio");
		}
		if(documentoFiscal.length() == TAMANHO_CPF) {
			setDocumentoFiscal (documentoFiscal, tipoCliente = TipoCliente.FISICA);				
		} else if (documentoFiscal.length() == TAMANHO_CNPJ){
			setDocumentoFiscal (documentoFiscal, tipoCliente = TipoCliente.JURIDICA);		
		} else {
			throw new RuntimeException("Documento invalido para pessoa Fisica ou Juridica");
		}
		this.documentoFiscal = documentoFiscal;
	}
	
	private void setDocumentoFiscal(String documentoFiscal, TipoCliente tipo, Cliente.TipoCliente tipoCliente) {
		this.documentoFiscal = documentoFiscal;
		this.tipoCliente = tipoCliente;
	}

	public Cliente.TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
}

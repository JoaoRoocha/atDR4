package EletronicosApp.model.domain;

public class Categoria extends Produto {
	private String descricao;
	
	public Categoria(int idProduto, String nomeProduto, String descricao, double precoProduto) {
		super(idProduto, nomeProduto, precoProduto);
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
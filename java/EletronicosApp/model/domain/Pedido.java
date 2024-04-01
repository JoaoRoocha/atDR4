package EletronicosApp.model.domain;

import java.util.List;

public class Pedido {
	private int idPedido;
	private String dataPedido;
	private double totalPedido;
	private List<Produto> produtos;
	
	public Pedido(int idPedido, String dataPedido, List<Produto> produtos) {
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.produtos = produtos;
		calcularTotal();
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public double getTotalPedido() {
		return totalPedido;
	}
	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	private void calcularTotal() {
	double total = 0.0;
	for(Produto produto : produtos) {
		total += produto.getPrecoProduto();
	}
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
		calcularTotal();
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
		calcularTotal();
	}
}

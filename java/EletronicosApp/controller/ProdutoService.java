package EletronicosApp.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import EletronicosApp.model.domain.Produto;

public class ProdutoService {

    private static Map<Integer, Produto> bancoDeDados = new HashMap<>();
    private int proximoId = 1;

    public Produto adicionarProduto(Produto produto) {
        produto.setIdProduto(proximoId);
        bancoDeDados.put(proximoId, produto);
        proximoId++;
        return produto;
    }

    public static Produto getProdutoById(int id) {
        return bancoDeDados.get(id);
    }

    public Produto atualizarProduto(int id, Produto produtoAtualizado) {
        if (bancoDeDados.containsKey(id)) {
            produtoAtualizado.setIdProduto(id);
            bancoDeDados.put(id, produtoAtualizado);
            return produtoAtualizado;
        }
        return null; 
        }

    public boolean excluirProduto(int id) {
        if (bancoDeDados.containsKey(id)) {
            bancoDeDados.remove(id);
            return true;
        }
        return false;
    }

    public List<Produto> getAllProdutos() {
        return new ArrayList<>(bancoDeDados.values());
    }
}
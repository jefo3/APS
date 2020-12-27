package Repositorios;

import java.util.HashMap;

import Produtos.Produto;

public class RepositorioProdutos {
    private HashMap<String, Produto> produtos = new HashMap<String, Produto>();

    public RepositorioProdutos(HashMap<String,Produto> produtos) {
        this.produtos = produtos;
    }

    public RepositorioProdutos() {
    }


    public HashMap<String,Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(HashMap<String,Produto> produtos) {
        this.produtos = produtos;
    }
        
    public void listar(){
        for (Produto i : produtos.values()) {
            System.out.println(i.getTitulo());
        }
    }

    public Produto procuraProduto(String codigoProduto) {
        for (Produto i : produtos.values()) {
            if (i.getCodigo().equals(codigoProduto)) {
                return i;
            }
        }
        return null;
    }
}
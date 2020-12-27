package Atores;

import java.util.Date;

import Produtos.Produto;
import Repositorios.Locacao;
import Repositorios.RepositorioLocacoes;
import Repositorios.RepositorioPessoa;
import Repositorios.RepositorioProdutos;

public class OperadorDeSistemas extends Funcionario {

    public OperadorDeSistemas(String nome, int matricula, String login, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }
    
    public Produto procurarProduto(String codigo, RepositorioProdutos rpr) {
        return rpr.getProdutos().get(codigo);
    }
    
    public Cliente procurarCliente(int matricula, RepositorioPessoa rpe) {
        return (Cliente) rpe.getPessoas().get(matricula);
    }

    public void addLocacao(Cliente c, Produto p, Date saida, RepositorioLocacoes rlo) {
        Locacao l = new Locacao(p.getCodigo(), ((Pessoa) c).getMatricula(), saida);
        rlo.getLocacoes().add(l);
    }

    public void baixaLocacao(Locacao l, Date entrega,  RepositorioLocacoes rlo){
        l.setDataEntrega(entrega);
        l.calculaMulta();
    }

    public void excluirLocacao(Locacao l, RepositorioLocacoes rlo) {
        rlo.getLocacoes().remove(l);
    }
}

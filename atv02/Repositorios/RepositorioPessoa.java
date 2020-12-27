package Repositorios;

import java.util.HashMap;

import Atores.Cliente;
import Atores.Gerente;
import Atores.OperadorDeSistemas;
import Atores.Pessoa;

public class RepositorioPessoa {
    private HashMap<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();

    public RepositorioPessoa() {
    }

    public RepositorioPessoa(HashMap<Integer, Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public HashMap<Integer,Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(HashMap<Integer,Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void listar(){
        for (Pessoa i : pessoas.values()) {
            System.out.println(i.getNome());
        }
    }

    public void listarOperadores(){
        for (Pessoa i : pessoas.values()) {
            if(i instanceof OperadorDeSistemas)
                System.out.println(i.getNome());
        }
    }

    public void listarClientes(){
        for (Pessoa i : pessoas.values()) {
            if(i instanceof Cliente)
                System.out.println(i.getNome());
        }
    }

    public Gerente LoginGerente(String login, String senha) {
        for (Pessoa i : pessoas.values()) {
            Gerente j;
            j = (Gerente) i;
            if (j.getLogin().equals(login) || j.getSenha().equals(senha)) {
                return j;
            }
        }
        return null;
    }

    public OperadorDeSistemas LoginOperador(String login, String senha) {
        for (Pessoa i : pessoas.values()) {
            OperadorDeSistemas j;
            j = (OperadorDeSistemas) i;
            if (j.getLogin().equals(login) || j.getSenha().equals(senha)) {
                return j;
            }
        }
        return null;
    }
}

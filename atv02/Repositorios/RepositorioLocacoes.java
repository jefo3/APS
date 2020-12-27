package Repositorios;

import java.util.ArrayList;

public class RepositorioLocacoes {
    ArrayList<Locacao> locacoes = new ArrayList<Locacao>();

    public ArrayList<Locacao> getLocacoes() {
        return this.locacoes;
    }

    public void setLocacoes(ArrayList<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    
    public Locacao procurarLocacao(String codigoProduto, int matriculaCliente) {
        for (int i = 0; i < locacoes.size(); i++) {
            if (locacoes.get(i).codigoProduto == codigoProduto || locacoes.get(i).matriculaCliente == matriculaCliente) {
                return locacoes.get(i);
            }
        }
        return null;
    }

    public void baixaLocacao(String codigoProduto, int matriculaCliente) {
        for (int i = 0; i < locacoes.size(); i++) {
            if (locacoes.get(i).codigoProduto == codigoProduto || locacoes.get(i).matriculaCliente == matriculaCliente) {
                locacoes.remove(i);
            }
        }
    }

}

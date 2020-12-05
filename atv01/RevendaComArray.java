package atv01;

import atv01.Produto;

public class RevendaComArray {

    private Produto[] produtos;
    private int i;

    public RevendaComArray(int qntProdutos) {
        this.produtos = new Produto[qntProdutos];
        this.i = 0;
    }

    public void inserirProduto(Produto prod){
        this.produtos[i] = prod;
        this.i++;
    }

    public void comprar(int codigo, int qnt){
        for(Produto p: produtos){
            if(p.getCodigo() == codigo){
                Produto.compra(qnt);
                return;
            }
        }
        System.out.println("Error:  codigo invalido");
    }

    public void vender(int codigo, int qnt){
        for(Produto p: produtos){
            if(p.getCodigo() == codigo){
                Produto.venda(qnt);
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }


    public void consultaPrecoVenda(int codigo){
        for(Produto p: produtos){
            if(p.getCodigo() == codigo){
                System.out.println("Preço: "+ p.getValor());
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }

    public void listaPrecos(){
        for(Produto p: produtos){
            System.out.println("## INFOS DO PRODUTO ##");
            System.out.println("Codigo: "+p.getCodigo());
            System.out.println("Descrição: "+ p.getDescricao());
            System.out.println("Preço: "+ p.getValor());
        }
    }

}

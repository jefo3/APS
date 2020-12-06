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
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                Produto.compra(qnt);
                return;
            }
        }
        System.out.println("Error:  codigo invalido");
    }

    public void vender(int codigo, int qnt){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                Produto.venda(qnt);
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }


    public void consultaPrecoVenda(int codigo){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                System.out.println("Preço: "+ this.produtos[x].calculaPrecoVenda());
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }

    public void listaPrecos(){
        for(int x = 0; x < this.i; x++ ){
            System.out.println("## INFOS DO PRODUTO ##");
            System.out.println("Codigo: "+this.produtos[x].getCodigo());
            System.out.println("Descrição: "+ this.produtos[x].getDescricao());
            System.out.println("Preço: "+ this.produtos[x].calculaPrecoVenda());
        }
    }

}

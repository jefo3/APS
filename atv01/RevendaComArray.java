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
                this.produtos[i].compra(qnt);
                return;
            }
        }
        System.out.println("Error:  codigo invalido");
    }

    public void vender(int codigo, int qnt){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                if(this.produtos[i].getQantEstoque() > 0){
                    this.produtos[i].venda(qnt);
                }else{
                    System.out.println("Acabou no estoque");
                }
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
    
    public void editarPreco(int codigo, double valor){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                this.produtos[x].setValor(valor);
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }

    public void editarCusto(int codigo, double custo){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                this.produtos[x].setCusto(custo);
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }

    public void editarMargenLucro(int codigo, double margemLucro){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                this.produtos[x].setMargemLucro(margemLucro);
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }

    public void mostrarPreco(int codigo){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                System.out.println("Valor de compra: " + this.produtos[x].getValor());
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }

    public void mostrarCusto(int codigo){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                System.out.println("custo: " + this.produtos[x].getCusto());
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }

    public void mostrarMargemLucro(int codigo){
        for(int x = 0; x < this.i; x++ ){
            if(this.produtos[x].getCodigo() == codigo){
                System.out.println("Valor de compra: " + this.produtos[x].getMargemLucro());
                this.produtos[x].getValor();
                return;
            }
        }
        System.out.println("Error: codigo invalido");
    }
}

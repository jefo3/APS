package atv01;

import java.util.Scanner;
import atv01.Produto;
import atv01.RevendaComArray;

public class Principal {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        int cont = 0, tam;
        int opc;

        int codigo; 
        String descricao; 
        double valor, custo, margemLucro; 
        int qntEstoque;
        
        System.out.println("irá cadastrar quandos produtos? ");
        tam = Integer.parseInt(in.nextLine());
        
        RevendaComArray produtos = new RevendaComArray(tam);
        
        do{
            System.out.println("1 - Adicionar Produto\n" +
                            "=======================================\n"+
							"2 - Comprar\n"+
                            "3 - Vender\n"+ 
                            "4 - Consultar Preço de um produto\n"+
                            "5 - Listar\n"+
                            "=======================================\n"+
                            "6 - Editar preco de um produto\n"+
                            "7 - Editar custo de um produto\n"+
                            "8 - Editar margem de lucro de um produto\n"+
                            "=======================================\n"+
                            "9 - consultar preco de um produto\n"+
                            "10 - consultar custo de um produto\n"+
                            "11 - consultar margem de lucro de um produto\n"+
                            "12 - Sair\n\n");
                            
            opc =  Integer.parseInt(in.nextLine());

            if(opc == 1){
                if(cont < tam){

                    System.out.println("Digite o codigo do produto: ");
                    codigo = Integer.parseInt(in.nextLine());

                    System.out.println("Digite a descrição do produto: ");
                    descricao = in.nextLine();

                    System.out.println("Digite o valor de compra do produto: ");
                    valor = Double.parseDouble(in.nextLine());

                    System.out.println("Digite o custa para armazernar e/ou beneficiar o produto: ");
                    custo = Double.parseDouble(in.nextLine());

                    System.out.println("Digite a margem de lucro: ");
                    margemLucro = Double.parseDouble(in.nextLine());

                    System.out.println("Digite a quantidade desse produto esta no estoque: ");
                    qntEstoque = Integer.parseInt(in.nextLine());

                    produtos.inserirProduto(new Produto(codigo, descricao, valor, custo, margemLucro, qntEstoque));

                    cont++;

                }else{
                    System.out.println("Estoque cheio, impossivel add mais produto");
                    System.out.print("aperte enter para continua...");
                    String pause = in.nextLine();
                }

            }else if(opc == 2){
                System.out.println("Digite o codigo do produto que esta procurando e a quantidade de produtos: ");
                codigo = Integer.parseInt(in.nextLine());
                int quantidade = Integer.parseInt(in.nextLine());

                produtos.comprar(codigo, quantidade);
                
                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();

            }else if(opc == 3){
                System.out.println("Digite o codigo do produto que esta procurando e a quantidade de produtos: ");
                codigo = Integer.parseInt(in.nextLine());
                int quantidade = Integer.parseInt(in.nextLine());

                produtos.vender(codigo, quantidade);
                
                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();
            }else if(opc == 4){
                System.out.println("Digite o codigo do produto que esta procurandoo preco: ");
                codigo = Integer.parseInt(in.nextLine());

                produtos.consultaPrecoVenda(codigo);
                
                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();

            }else if(opc == 5){
                System.out.println("####### LISTA DE PRODUTOS ######");
                produtos.listaPrecos();

                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();


            }else if(opc == 6){

                System.out.println("Digite o codigo do produto e o novo valor: ");
                codigo = Integer.parseInt(in.nextLine());
                double novoValor = Double.parseDouble(in.nextLine());

                produtos.editarPreco(codigo, novoValor);
                
                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();

            }else if(opc == 7){

                System.out.println("Digite o codigo do produto e o novo valor: ");
                codigo = Integer.parseInt(in.nextLine());
                double novoValor = Double.parseDouble(in.nextLine());

                produtos.editarCusto(codigo, novoValor);
                
                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();
            }else if(opc == 8){
                System.out.println("Digite o codigo do produto e o novo valor: ");
                codigo = Integer.parseInt(in.nextLine());
                double novoValor = Double.parseDouble(in.nextLine());

                produtos.editarMargenLucro(codigo, novoValor);
                
                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();
            }else if(opc == 9){
                
                System.out.println("Digite o codigo do produto que quer consultar");
                codigo = Integer.parseInt(in.nextLine());
                produtos.mostrarPreco(codigo);

                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();

            }else if(opc == 10){
                
                System.out.println("Digite o codigo do produto que quer consultar");
                codigo = Integer.parseInt(in.nextLine());
                produtos.mostrarCusto(codigo);

                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();

            }else if(opc == 11){
                
                System.out.println("Digite o codigo do produto que quer consultar");
                codigo = Integer.parseInt(in.nextLine());
                produtos.mostrarMargemLucro(codigo);

                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();

            }else if(opc == 12){
            
            }else{
                System.out.println("Valor digitado é invalido, digite um válido");
                System.out.print("aperte enter para continua...");
                String pause = in.nextLine();
            }

        }while(opc != 12);
    }
}

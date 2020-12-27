package Inteface;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import Atores.Cliente;
import Atores.Gerente;
import Atores.OperadorDeSistemas;
import Produtos.BluRay;
import Produtos.CD;
import Produtos.DVD;
import Produtos.LP;
import Produtos.Produto;
import Produtos.VHS;
import Repositorios.Locacao;
import Repositorios.RepositorioLocacoes;
import Repositorios.RepositorioPessoa;
import Repositorios.RepositorioProdutos;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void perfilGerente(Gerente g, RepositorioProdutos rpr, RepositorioPessoa rpe) {
        while (true) {
            System.out.printf("****Olá Gerente %s***** \n1 – Cadastrar Produto \n2 – Cadastrar Cliente \n3 – Cadastrar Operador \n4 – Listar Produtos \n5 – Listar Clientes \n6 – Listar Operadores \n7 – Procurar Produto \n8 – Procurar Cliente \n9 – Procurar Operador \n10 – Sair \nDigite a opção:", g.getNome());
            int op2 = sc.nextInt();
            switch (op2) {
                case 1:
                    System.out.printf("****Escolha o tipo de produto: \n1 - BluRay \n2 - CD \n3 - DVD \n4 - LP \n5 - VHS\n");
                    int op3 = sc.nextInt();
                    switch (op3) {
                        case 1:
                            System.out.println("codigo");
                            String codigo1 = sc.next();
                            System.out.println("Titulo");
                            String titulo1 = sc.next();
                            System.out.println("Genero");
                            String genero1 = sc.next();
                            System.out.println("Locado");
                            boolean locado1 = sc.nextBoolean();
                            System.out.println("Ano de Lancamento");
                            int ano1 = sc.nextInt();
                            System.out.println("Duracao");
                            int duracao1 = sc.nextInt();
                            System.out.println("Idioma principal");
                            String[] idiomas = new String[2];
                            idiomas[0] = sc.next();
                            System.out.println("Idioma Alternativo");
                            idiomas[1] = sc.next();
                            BluRay br = new BluRay(codigo1, titulo1, genero1, locado1, ano1, duracao1, idiomas);
                            g.addProduto(br, rpr);
                            break;
                        case 2:
                            System.out.println("codigo");
                            String codigo2 = sc.next();
                            System.out.println("Titulo");
                            String titulo2 = sc.next();
                            System.out.println("Genero");
                            String genero2 = sc.next();
                            System.out.println("Locado");
                            boolean locado2 = sc.nextBoolean();
                            System.out.println("Autor");
                            String autor2 = sc.next();
                            System.out.println("Numero de Faixas");
                            int faixas2 = sc.nextInt();
                            System.out.println("Arranhado");
                            boolean arranhado2 = sc.nextBoolean();
                            System.out.println("Duplo");
                            boolean duplo2 = sc.nextBoolean();
                            CD cd = new CD(codigo2, titulo2, genero2, locado2, autor2, faixas2, arranhado2, duplo2);
                            g.addProduto(cd, rpr);
                            break;
                        case 3:
                            System.out.println("codigo");
                            String codigo3 = sc.next();
                            System.out.println("Titulo");
                            String titulo3 = sc.next();
                            System.out.println("Genero");
                            String genero3 = sc.next();
                            System.out.println("Locado");
                            boolean locado3 = sc.nextBoolean();
                            System.out.println("Ano de Lancamento");
                            int ano3 = sc.nextInt();
                            System.out.println("Duracao");
                            int duracao3 = sc.nextInt();
                            System.out.println("Arranhado");
                            boolean arranhado3 = sc.nextBoolean();
                            DVD dvd = new DVD(codigo3, titulo3, genero3, locado3, ano3, duracao3, arranhado3);
                            g.addProduto(dvd, rpr);
                            break;
                        case 4:
                            System.out.println("codigo");
                            String codigo4 = sc.next();
                            System.out.println("Titulo");
                            String titulo4 = sc.next();
                            System.out.println("Genero");
                            String genero4 = sc.next();
                            System.out.println("Locado");
                            boolean locado4 = sc.nextBoolean();
                            System.out.println("Autor");
                            String autor4 = sc.next();
                            System.out.println("Numero de Faixas");
                            int faixas4 = sc.nextInt();
                            System.out.println("Raro");
                            boolean raro4 = sc.nextBoolean();
                            LP lp = new LP(codigo4, titulo4, genero4, locado4, autor4, faixas4, raro4);
                            g.addProduto(lp, rpr);
                            break;
                        case 5:
                            System.out.println("codigo");
                            String codigo5 = sc.next();
                            System.out.println("Titulo");
                            String titulo5 = sc.next();
                            System.out.println("Genero");
                            String genero5 = sc.next();
                            System.out.println("Locado");
                            boolean locado5 = sc.nextBoolean();
                            System.out.println("Ano de Lancamento");
                            int ano5 = sc.nextInt();
                            System.out.println("Arranhado");
                            boolean cores = sc.nextBoolean();
                            System.out.println("Duracao");
                            int duracao5 = sc.nextInt();
                            VHS vhs = new VHS(codigo5, titulo5, genero5, locado5, ano5, cores, duracao5);
                            g.addProduto(vhs, rpr);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Nome");
                    String nome1 = sc.next();
                    System.out.println("Matricula");
                    int matricula1 = sc.nextInt();
                    System.out.println("Endereco");
                    String endereço = sc.next();
                    System.out.println("Idade");
                    int idade = sc.nextInt();
                    System.out.println("Sexo");
                    char sexo = sc.next().charAt(1);
                    Cliente c = new Cliente(nome1, matricula1, endereço, idade, sexo);
                    g.addCliente(c, rpe);
                    break;
                case 3:
                    System.out.println("Nome");
                    String nome2 = sc.next();
                    System.out.println("Matricula");
                    int matricula2 = sc.nextInt();
                    System.out.println("Login");
                    String login = sc.next();
                    System.out.println("Senha");
                    String senha = sc.next();
                    OperadorDeSistemas operador = new OperadorDeSistemas(nome2, matricula2, login, senha);
                    g.addOperador(operador, rpe);
                    break;
                case 4:
                    g.listarProdutos(rpr);
                    break;
                case 5:
                    g.listarClientes(rpe);
                    break;
                case 6:
                    g.listarOperadores(rpe);
                    break;
                case 7:
                    System.out.println("codigo");
                    String codigo6 = sc.next();
                    g.procurarProduto(codigo6, rpr);
                    break;
                case 8:
                    System.out.println("Matricula");
                    int matricula3 = sc.nextInt();
                    g.procurarCliente(matricula3, rpe);
                    break;
                case 9:
                    System.out.println("Matricula");
                    int matricula4 = sc.nextInt();
                    g.procurarOperador(matricula4, rpe);
                    break;
                default:
                    break;
            }
        }
        
    }

    public static void perfilOperador(OperadorDeSistemas op, RepositorioProdutos rpr, RepositorioPessoa rpe, RepositorioLocacoes rlo) throws ParseException {
        while (true) {
            System.out.printf("****Olá Operador %s****\n1 – Fazer locação \n2 – Dar baixa em locação \n3 – Excluir locação \n4 – Procurar Produto \n5 – Procurar Cliente \n6 – Sair \nDigite a opção:", op.getNome());
            DateFormat f = DateFormat.getDateInstance();
            int op4 = sc.nextInt();
            switch (op4) {
                case 1:
                    System.out.println("codigo");
                    String codigo1 = sc.next();
                    System.out.println("Matricula");
                    int matricula1 = sc.nextInt();
                    System.out.println("Data");
                    String d1 =  sc.next();
                    Date data1 = f.parse(d1);
                    Locacao l = new Locacao(codigo1, matricula1, data1);
                    rlo.getLocacoes().add(l);
                    break;
                case 2:
                    System.out.println("codigo");
                    String codigo2 = sc.next();
                    System.out.println("Matricula");
                    int matricula2 = sc.nextInt();
                    Locacao l1 = rlo.procurarLocacao(codigo2, matricula2);
                    String d2 =  sc.next();
                    Date data2 = f.parse(d2);
                    l1.setDataEntrega(data2);
                    l1.calculaMulta();
                    break;
                case 3:
                    System.out.println("codigo");
                    String codigo3 = sc.next();
                    System.out.println("Matricula");
                    int matricula3 = sc.nextInt();
                    rlo.baixaLocacao(codigo3, matricula3);
                    break;
                case 4:
                    System.out.println("codigo");
                    String codigo4 = sc.next();
                    System.out.println("Matricula");
                    int matricula4 = sc.nextInt();
                    rlo.baixaLocacao(codigo4, matricula4);
                    break;
                case 5:
                    System.out.println("codigo");
                    String codigo5 = sc.next();
                    Produto p = rpr.procuraProduto(codigo5);
                    System.out.println(p.toString());
                    break;
                case 6:
                    
                    break;
                default:
                    break;
            }
        }
        
    }

    public static void main(String[] args) throws ParseException {
        Gerente gerente1 = new Gerente("Thiago", 123, "login", "senha");
        RepositorioPessoa rpe = new RepositorioPessoa();
        RepositorioProdutos rpr = new RepositorioProdutos();
        RepositorioLocacoes rlo =  new RepositorioLocacoes();
        gerente1.addGerente(gerente1, rpe);
        System.out.print("****Bem-vindo, escolha um perfil abaixo: \n1 – Gerente \n2 – Operador de Sistema \n3 – Sair \nDigite a opção: _<ENTER>");
        int op = sc.nextInt();
        System.out.println("****Faça seu Login****");
        System.out.println("Digite seu login: ");
        String login = sc.next();
        System.out.println("Digite sua senha: ");
        String senha = sc.next();
        switch (op) {
            case 1:
                Gerente gerente = rpe.LoginGerente(login, senha);
                if (gerente != null) {
                    perfilGerente(gerente, rpr, rpe);
                }
                break;
            case 2:
                OperadorDeSistemas operadorDeSistemas = rpe.LoginOperador(login, senha);
                if (operadorDeSistemas != null) {
                    perfilOperador(operadorDeSistemas, rpr, rpe, rlo);
                }
                break;
            case 3:
                
                break;
            default:
                System.out.println("OP Invalido!");
                break;
        }
        sc.close();
    }
}

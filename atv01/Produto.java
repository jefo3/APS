package atv01;

public class Produto{
    
    private int codigo;
    private String descricao;
    private double valor;
    private double custo;
    private double margemLucro;
    public int qantEstoque = 0;

    public Produto(){

    }

    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double valor, double custo, double margemLucro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.custo = custo;
        this.margemLucro = margemLucro;
    }

    public Produto(int codigo, String descricao, double valor, double custo, double margemLucro, int qntEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.custo = custo;
        this.margemLucro = margemLucro;
        this.compra(qntEstoque);
    }

    public void compra(int quant){
        qantEstoque += quant;
    }

    public void venda(int quant){
        qantEstoque -= quant;
    }

    public double calculaPrecoVenda(){
        return valor + custo + margemLucro * (valor+custo); 
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCusto() {
        return this.custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargemLucro(){
        return this.margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public int getQantEstoque(){
        return this.qantEstoque;
    }

    public void setQantEstoque(int qantEstoque) {
        this.qantEstoque = qantEstoque;
    }


    @Override
    public String toString() {
        return "Produto {" +
            " codigo='" + getCodigo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", valor='" + getValor() + "'" +
            ", custo='" + getCusto() + "'" +
            ", margem de lucro='" + getMargemLucro() + "'" +
            "}";
    }


}
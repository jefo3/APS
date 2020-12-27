package Repositorios;


import java.util.Calendar;
import java.util.Date;

public class Locacao {
    String codigoProduto;
    int matriculaCliente;
    Date DataSaida, DataEntrega;

    public Locacao(String codigoProduto, int matriculaCliente, Date dataSaida) {
        this.codigoProduto = codigoProduto;
        this.matriculaCliente = matriculaCliente;
        DataSaida = dataSaida;
    }

    public String getCodigoProduto() {
        return this.codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getMatriculaCliente() {
        return this.matriculaCliente;
    }

    public void setMatriculaCliente(int matriculaCliente) {
        this.matriculaCliente = matriculaCliente;
    }

    public Date getDataSaida() {
        return this.DataSaida;
    }

    public void setDataSaida(Date DataSaida) {
        this.DataSaida = DataSaida;
    }

    public Date getDataEntrega() {
        return this.DataEntrega;
    }

    public void setDataEntrega(Date DataEntrega) {
        this.DataEntrega = DataEntrega;
    }
    
    public void calculaMulta() {
        Calendar dataProposta = Calendar.getInstance();
        dataProposta.setTime(DataSaida);
        dataProposta.add(Calendar.MONTH, 1);
        if (dataProposta.after(DataEntrega)); {
            System.out.println("MULTA!");
        }
    }
}

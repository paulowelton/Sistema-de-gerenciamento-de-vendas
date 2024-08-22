package main.java.model;

import java.sql.Date;

public class Venda {
    public Produto produto;
    public Funcionario funcionario;
    public String cliente,formaPagamento;
    public Date data;

    public Venda(Produto p, Funcionario f, String c, String fp){
        this.produto = p;
        this.funcionario = f;
        this.cliente = c;
        this.formaPagamento = fp;
        this.data = new Date(System.currentTimeMillis());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public Date getData(){
        return data;
    }
    public void setData(Date data){
        this.data = data;
    }

    
}

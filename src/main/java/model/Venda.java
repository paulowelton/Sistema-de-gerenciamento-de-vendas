package main.java.model;

import java.time.LocalDate;

public class Venda {
    public Produto produto;
    public Funcionario funcionario;
    public String cliente,formaPagamento;
    public LocalDate data;

    public Venda(Produto p, Funcionario f, String c, String fp){
        this.produto = p;
        this.funcionario = f;
        this.cliente = c;
        this.formaPagamento = fp;
        this.data = LocalDate.now();
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

    
}

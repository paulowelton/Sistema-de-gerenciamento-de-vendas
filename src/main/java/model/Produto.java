package main.java.model;

public class Produto {
    public String nome, tipo;
    public int preco, quantidade;

    public Produto(String n, String t, int p, int q){
        this.nome = n;
        this.tipo = t;
        this.preco = p;
        this.quantidade = q;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}

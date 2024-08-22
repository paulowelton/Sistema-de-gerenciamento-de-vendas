package main.java.controller;
import main.java.model.Produto;
import main.java.model.Venda;

public class VendaController {
    public void criarVenda(Venda venda){
        String nomeProduto = venda.getProduto().getNome();
        String FuncionarioVenda = venda.getFuncionario().getNome();
        String cliente = venda.getCliente();
        int valorProduto = venda.getProduto().getPreco();
        String formaPagameno = venda.getFormaPagamento();
        
    }
    
    public void exibirVenda(Venda venda){
        System.out.println("Nome do Produto: " + venda.getProduto().getNome());
        System.out.println("Funcionario da venda: " + venda.getFuncionario().getNome());
        System.out.println("Cliente da venda: " + venda.getCliente());
        System.out.println("Preco do produto: " + venda.getProduto().getPreco());
        System.out.println();
    }
}

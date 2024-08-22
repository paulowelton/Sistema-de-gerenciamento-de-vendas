package main.java.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import main.java.model.Conexao;
import main.java.model.Venda;

public class VendaController {
    public void criarVenda(Venda venda) {
        String nomeProduto = venda.getProduto().getNome();
        String funcionarioVenda = venda.getFuncionario().getNome();
        String cliente = venda.getCliente();
        int valorProduto = venda.getProduto().getPreco();
        Date dataAtual = venda.getData();

        try {
            Conexao conexao = new Conexao();
            Connection conn = conexao.conexaoBD();
            String sqlCriarVenda = "INSERT INTO Vendas (nomeProduto, FuncionarioVenda, cliente, precoProduto, dataVenda) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sqlCriarVenda);
            preparedStatement.setString(1, nomeProduto);
            preparedStatement.setString(2, funcionarioVenda);
            preparedStatement.setString(3, cliente);
            preparedStatement.setInt(4, valorProduto);
            preparedStatement.setDate(5, dataAtual);

            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Inserido com sucesso");
            } else {
                System.out.println("Erro ao inserir");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void exibirVenda(Venda venda) {
        System.out.println("Nome do Produto: " + venda.getProduto().getNome());
        System.out.println("Funcionario da venda: " + venda.getFuncionario().getNome());
        System.out.println("Cliente da venda: " + venda.getCliente());
        System.out.println("Preco do produto: " + venda.getProduto().getPreco());
        System.out.println();
    }
}

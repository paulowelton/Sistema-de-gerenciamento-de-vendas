package main.java.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        produtoController produtoController = new produtoController();

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
            produtoController.ajustarEstoqueVenda(venda.getProduto());

            if (linhasAfetadas > 0) {
                System.out.println("Inserido com sucesso");
            } else {
                System.out.println("Erro ao inserir");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void exibirVendas() {
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.conexaoBD();
            String sqlRetornarVendas = "SELECT * FROM Vendas";
            PreparedStatement preparedStatement = conn.prepareStatement(sqlRetornarVendas);
            ResultSet resultSet = preparedStatement.executeQuery();


            while(resultSet.next()){
                System.out.println("nomeProduto: " + resultSet.getString("nomeProduto"));
                System.out.println("Funciornario da venda: " + resultSet.getString("FuncionarioVenda"));
                System.out.println("Preco: " + resultSet.getString("precoProduto"));
                System.out.println("Data da venda: " + resultSet.getDate("dataVenda"));
                System.out.println();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}

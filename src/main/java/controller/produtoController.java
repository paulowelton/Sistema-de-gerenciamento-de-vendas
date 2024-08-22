package main.java.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import main.java.model.Conexao;
import main.java.model.Produto;

public class produtoController {
    public void criarProduto(Produto produto){
        
    }

    public void exibirEstoqueProduto(ArrayList<Produto> produto){
        for(Produto p : produto){
            System.out.println(p.getNome() + ": " + p.getQuantidade());
            System.out.println();
        }
        
    }

    public void ajustarEstoqueVenda(Produto produto){
        int novaQuantidade = produto.getQuantidade() - 1;
        String nomeProduto = produto.getNome();

        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.conexaoBD();
            String sqlAjustarEstoqueVenda = "UPDATE Produto SET quantidade = ? WHERE nome = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sqlAjustarEstoqueVenda);
            preparedStatement.setInt(1, novaQuantidade);
            preparedStatement.setString(2, nomeProduto);

            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

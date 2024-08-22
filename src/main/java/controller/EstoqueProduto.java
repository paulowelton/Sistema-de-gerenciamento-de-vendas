package main.java.controller;

import java.util.ArrayList;

import main.java.model.Produto;

public class EstoqueProduto {
    public void exibirEstoqueProduto(ArrayList<Produto> produto){
        for(Produto p : produto){
            System.out.println(p.getNome() + ": " + p.getQuantidade());
            System.out.println();
        }
    }
}

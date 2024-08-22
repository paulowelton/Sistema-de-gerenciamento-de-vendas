package main.java;

import main.java.controller.EstoqueProduto;
import main.java.controller.FuncionarioController;
import main.java.controller.VendaController;
import main.java.model.Funcionario;
import main.java.model.Produto;
import main.java.model.Venda;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Produto Produto = new Produto("capinha", "tech", 30, 12);
        Funcionario funcionario = new Funcionario("paulo", "dev", "manha", LocalDate.of(2006, 11, 11), "123.123.123-12");
        Venda venda = new Venda(Produto, funcionario, "paulo", "pix");
        VendaController vendaController = new VendaController();

        //ArrayList<Venda> vendas = new ArrayList<>();

        //vendas.add(venda);

        //for(Venda v : vendas){
        //    vendaController.exibirVenda(v);
        //}

        //ArrayList<Produto> prods = new ArrayList<>();
        //prods.add(Produto);
        //prods.add(new Produto("earphone", "tech", 20, 34));

        //EstoqueProduto ep = new EstoqueProduto();
        //ep.exibirEstoqueProduto(prods);

        vendaController.criarVenda(venda);
    }
}

package main.java.controller;
import main.java.model.Funcionario;
import java.time.LocalDate;;

public class FuncionarioController {
    public void calcularIdade(Funcionario funcionario){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        LocalDate aniversarioFuncionario = funcionario.getAniversario();
        int anoAniversarioFuncionario = aniversarioFuncionario.getYear();

        int idadeFuncionario = anoAtual - anoAniversarioFuncionario;
        int mesAtual = dataAtual.getMonthValue();
        int mesFuncionario = aniversarioFuncionario.getMonthValue();

        if(mesAtual < mesFuncionario){
            idadeFuncionario--;
        }

        System.out.println("Idade do funcionario "+ funcionario.getNome() + ": " + idadeFuncionario);
    }

    public void exibirFuncionario(Funcionario funcionario){
        System.out.println("Nome do funcionario: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Turno: " + funcionario.getTurno());
        System.out.println("Aniversário: " + funcionario.getAniversario());
        System.out.println();
    }
}

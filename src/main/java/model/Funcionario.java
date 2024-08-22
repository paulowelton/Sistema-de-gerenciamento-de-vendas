package main.java.model;
import java.time.LocalDate;

public class Funcionario {
    public String nome,setor,turno, cpf;
    public LocalDate aniversario;

    public Funcionario(String n, String s, String t, LocalDate a, String c){
        this.nome = n;
        this.setor = s;
        this.turno = t;
        this.aniversario = a;
        this.cpf = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}

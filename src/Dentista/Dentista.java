package Dentista;

import Procedimento.Procedimento;

public class Dentista {
    private String nome;
    private String sobrenome;
    private String registro;
    Procedimento procedimento;

    public Dentista(String nome, String sobrenome, String registro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registro = registro;
    }

    public void atenderPaciente() {
        System.out.println("Boa tarde.");
    }
    public Procedimento fazerProcedimento() {
        return procedimento;
    }
    public void realizarDiagnostico() {
        System.out.println("Salvo no histórico do paciente.");
    }
}

package Paciente;

import java.util.Date;

public class Paciente {
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String numeroDocumento;
    private String celular;

    public Paciente(String nome, String sobrenome, String dataNascimento, String numeroDocumento, String celular) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
    }

    public void marcarConsulta() {
        System.out.println("Gostaria de marcar uma consulta.");
    }
    public double pagar(double custo) {
        return custo;
    }
    public void receberDiagnostico() {
        System.out.println("Fazer apenas limpeza de rotina.");
    }
}

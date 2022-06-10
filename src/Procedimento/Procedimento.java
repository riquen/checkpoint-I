package Procedimento;

import java.time.LocalTime;

public class Procedimento {
    private String nome;
    private double custo;
    private String duracao;

    public Procedimento(String nome, double custo, String duracao) {
        this.nome = nome;
        this.custo = custo;
        this.duracao = duracao;
    }
}

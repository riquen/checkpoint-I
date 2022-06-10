package Agenda;

import Paciente.Paciente;
import Procedimento.Procedimento;

import java.time.LocalTime;
import java.util.Date;

public class Agenda {
    private Date dia;
    private LocalTime hora;
    Paciente paciente;
    Procedimento procedimento;

    public void alerta() {
        System.out.println("Procedimento marcado.");
    }
}

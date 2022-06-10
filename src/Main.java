import Dentista.Dentista;
import Diagnostico.Diagnostico;
import Paciente.Paciente;
import Procedimento.Procedimento;

public class Main {
    public static void main(String[] args) {
        Dentista dentista = new Dentista("Isabelly", "Arantes", "CRO-090622");

        Paciente paciente1 = new Paciente("Karla", "Mazia", "12/07/1989", "12345678", "(11)91234-5678");
        Paciente paciente2 = new Paciente("Henrique", "Arantes", "17/04/1995", "87654321", "(31)98765-4321");
        Paciente paciente3 = new Paciente("Ysis", "Valverde", "31/12/1990", "12348765", "(11)98765-1234");

        Procedimento procedimento1 = new Procedimento("Limpeza de rotina", 80, "00h30");
        Procedimento procedimento2 = new Procedimento("Extração", 150, "01h30");
        Procedimento procedimento3 = new Procedimento("Restauração", 200,"01h30");

        Diagnostico diagnostico1 = new Diagnostico("A limpeza ocorreu conforme esperado.");
        Diagnostico diagnostico2 = new Diagnostico("Foi realizada a extração do dente 24 e não houve necessidadede de reaplicação da anestesia.");
        Diagnostico diagnostico3 = new Diagnostico("Foram realizadas restaurações nos dentes 8 e 19 com sucesso.");
    }
}
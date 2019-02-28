package br.com.estudo.enumeradores;

public class DiaSemanaTest {
    public static void main(String args[]) {
        DiaSemana diaSemana = DiaSemana.SEGUNDA;


        System.out.println(diaSemana.toString() + " - " + diaSemana.getDia());
        System.out.println(diaSemana.dia);

        DiaSemana diaSemana1 = DiaSemana.DOMINGO;
        System.out.println(diaSemana1.toString() + " - " + diaSemana1.getDia());
        System.out.println(diaSemana1.dia);

    }
}

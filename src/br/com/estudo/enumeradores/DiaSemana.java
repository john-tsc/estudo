package br.com.estudo.enumeradores;

public enum DiaSemana {
    //Os argumentos são os valores que cada CONSTANTE enum possui.
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    int dia =0;

    DiaSemana(int dia) {
        if (dia < 1 || dia > 7){
            throw new IllegalArgumentException("Dia da semana fora do intervalo permitido");
        }
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
}

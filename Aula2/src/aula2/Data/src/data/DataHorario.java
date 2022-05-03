package data;

import java.util.Scanner;

public class DataHorario {

    public static void main(String[] args) {
        

        Data dia = new Data(15, 04, 2022);
        System.out.println("Dia: " + dia);

        DataHora horas = new DataHora(15, 04, 2022, 17, 30);
        System.out.println("Hora: "+ horas);
    }
}

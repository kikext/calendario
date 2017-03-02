package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dia;
        int mes;
        int ano;


        System.out.println("dame un dia:");
            dia = scanner.nextInt();


        System.out.println("dame un mes: ");
            mes = scanner.nextInt();


        System.out.println("dame un año: ");
            ano = scanner.nextInt();

        calendario c1= new calendario(dia, mes, ano);

        System.out.println("en cuanto deseas aumentar el num de dia?(si pulsas 0 no se aumentará)");
            int aumento = scanner.nextInt();
            c1.incrementarDia(aumento);

        System.out.println("en cuanto deseas aumentar el num de mes?(si pulsas 0 no se aumentará)");
        int aumentoMes = scanner.nextInt();
        c1.incrementarMes(aumentoMes);

        System.out.println("en cuanto deseas aumentar el num de año?(si pulsas 0 no se aumentará)");
        int aumentoAno = scanner.nextInt();
        c1.incrementarAno(aumentoAno);

        System.out.println(dia+" "+mes+" "+ano);



    }
}

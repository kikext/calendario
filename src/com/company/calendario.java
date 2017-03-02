package com.company;

import java.time.LocalDate;

/**
 * Created by 25374183p on 23/02/2017.
 */
public class calendario {
        private LocalDate fecha;



    //------- constructor-----------
    public calendario(int day, int month, int year) {

        fecha=LocalDate.of(year,month,day);


    }

    public calendario() {
    }



    public void incrementarDia(int cantidad){
        fecha= fecha.plusDays(cantidad);

    }
    public void incrementarMes(int cantidad){
        fecha = fecha.plusMonths(cantidad);
    }
    public void incrementarAno(int cantidad){
        fecha = fecha.plusYears(cantidad);

    }


}

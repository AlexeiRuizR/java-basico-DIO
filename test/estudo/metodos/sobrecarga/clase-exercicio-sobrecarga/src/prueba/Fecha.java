package prueba;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JSpinner.DateEditor;

public class Fecha {
  public static void main(String[] args) {
    Date fechaActual = new Date();
    System.out.println(fechaActual);
    System.out.println("El primer día del próximo mes es: " +
    LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()
    ).getDayOfWeek() );
    System.out.println("El día de hoy: " + LocalDate.now().getDayOfWeek());
    System.out.println("El día de hoy: " + LocalDate.of(2022, 10, 16).getDayOfWeek());
    LocalDate fNacimiento = LocalDate.of(1972, Month.AUGUST, 10);
    System.out.println(ChronoUnit.YEARS.between(fNacimiento, LocalDate.now()));

  }
}

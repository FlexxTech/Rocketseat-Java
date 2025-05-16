package FundamentosJava.test.je25_java_time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateSimple {
    public static void main(String[] args) {
        LocalDate meuAniversario = LocalDate.of(2001, Month.APRIL,8);
        LocalDate dataQueFara15Anos = meuAniversario.plusYears(15);

        LocalDate data = LocalDate.of(2021,8,23);

        System.out.println(data.getDayOfMonth());   // retorna o dia do mês -> 23
        System.out.println(data.getYear());         // retorna o ano -> 2023
        System.out.println(data.getMonth());        // retorna o elemento de enum java.time.Month -> AUGUST
        System.out.println(data.getMonthValue());   // retorna o número do mês entre 1-12 -> 8

    }
}

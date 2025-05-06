package je25_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.of(2023, 1, 24, 16,31,27);

        LocalDate data = dataHora.toLocalDate();
        System.out.println(data);
        }
}

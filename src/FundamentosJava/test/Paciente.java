package FundamentosJava.test;

import java.util.Scanner;

public class Paciente {
    public static void main(String[] args) {
        // Simulando entrada por delimitadores
        String stringLinhaArquivo = "Kaique;24;15997924127;Laisa;27;15887873243";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter(";");

        while (scan.hasNext()) {
            String nome = scan.next();
            int idade = scan.nextInt();
            String telefone = scan.next();

            System.out.println("Nome do Paciente: " + nome);
            System.out.println("Idade do Paciente: " + idade);
            System.out.println("Telefone do Paciente: " + telefone);
            System.out.println("---------------------------------");
        }
    }
}

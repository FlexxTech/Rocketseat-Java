package Modulo2AindaSobreJava.je_29_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List <String> prateleira = new ArrayList(); // Garantindo que só irá ter String
        prateleira.add("jeep");
        prateleira.add("fordK");
        prateleira.add("ferrari");
        prateleira.add("bmw");

        Collections.sort(prateleira); // Classificação A-Z
        for (String carrinho: prateleira){
            System.out.println(carrinho);
        }

        Collections.shuffle(prateleira); // Ele vai embaralhar a ordem
        Collections.reverse(prateleira); // Ele vai inverter a ordem
    }
}

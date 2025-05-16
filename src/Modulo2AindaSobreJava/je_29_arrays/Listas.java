package Modulo2AindaSobreJava.je_29_arrays;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List linguagens = new ArrayList();
        linguagens.add("Java");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Go");
        linguagens.add("Java");

        linguagens.remove("Go");
        linguagens.add(3,"Python");

        for (Object linguagem: linguagens){
            System.out.println(linguagem);
        }
    }
}

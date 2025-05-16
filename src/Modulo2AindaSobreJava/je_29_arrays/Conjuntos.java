package Modulo2AindaSobreJava.je_29_arrays;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        // Ele não permite duplicatas e nem realocações de indices
        // E ele ordena automaticamente e nao na ordem que foi feito
        Set linguagens = new HashSet();
        Set linguagens2 = new LinkedHashSet(); // Já o  LinkedHashSet ele coloca na ordem que formos colocando
        Set linguagens3 = new TreeSet(); // No string ele ordena por ordem AlfaNumerica
        linguagens3.add("Java");
        linguagens3.add("C#");
        linguagens3.add("JS");
        linguagens3.add("Go");
        linguagens3.add("Java");

        // linguagens.add(3,"Python"); - Negado

        for (Object linguagem: linguagens3){
            System.out.println(linguagem);
        }
    }
}

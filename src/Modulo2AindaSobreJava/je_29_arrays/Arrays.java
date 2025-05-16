package Modulo2AindaSobreJava.je_29_arrays;

public class Arrays {
    public static void main(String[] args) {
        // Usamos abreviado quando já sabemos os valores
        Integer[] array = {2,4,10,15,5,3};

        for (int i = 0; i < array.length; i++) {
            int elemento = array[i];
            System.out.println(elemento);
        }
    }
}

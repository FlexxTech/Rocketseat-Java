package Modulo2AindaSobreJava.je_29_arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String,String> estados = new HashMap<>(); // Map<String,String> dizemos que as chaves e valores são string
        estados.put("PI","Piaui");
        estados.put("MA","Maranhão");
        estados.put("CE","Ceara");

        Iterator <String> keys = estados.keySet().iterator();

        while (keys.hasNext()){
            String key = keys.next();
            String value = estados.get(key);

            System.out.println("Sigla: " + key + " Estado: " + value);
        }
    }
}

package Reto_2;

import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Asscii asscii = new Asscii();
        asscii.completeList();
        descifrarCodigo("11610497110107115 102111114 11210897121105110103 9911110010110998101114 11210810197115101 11510497114101", asscii.getLettersAndNumbers());
    }

    public static void descifrarCodigo(String codigo, List<HashMap> lettersAndNumbers){
        String[] codigoArray = codigo.split(" ");
        String frase = "";
        for (int i = 0; i < codigoArray.length; i++) {
            String palabra = codigoArray[i];
            int a=0;
            for( int j = 0; j < palabra.length()-2; j+=a) {
                String numeroSTR = palabra.charAt(j) + "" + palabra.charAt(j + 1);
                int numero1 = Integer.parseInt(numeroSTR);
                if ((numero1 <= 99 && numero1 >= 65) ||(numero1 >= 48 && numero1 <= 57)) {
                    a = 2;
                } else {
                    numeroSTR = palabra.charAt(j) + "" + palabra.charAt(j + 1) + "" + palabra.charAt(j + 2);
                    a = 3;
                }
                int numero = Integer.parseInt(numeroSTR);
                for (int k = 0; k < lettersAndNumbers.size(); k++) {
                    if (lettersAndNumbers.get(k).containsKey(numero)) {
                        frase += lettersAndNumbers.get(k).get(numero);
                    }
                }
            }
            frase += " ";
        }
        System.out.println(frase);
    }
}

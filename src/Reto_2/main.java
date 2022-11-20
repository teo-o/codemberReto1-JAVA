package Reto_2;

import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Asscii asscii = new Asscii();
        asscii.completeList();
        descifrarCodigo("83101 113117105101110 101114101115 84101 9911111011112299111 84117 110111 109101 9911111011199101115 97 109105 84101 101115116111121 1119811510111411897110100111 84101 101115116111121 115105103117105101110100111 81117105101114101115 10611710397114 7411710110397 99111110109105103111 8697108101 8697109111115 97 10611710397114 691061019911711697 101115116101 9911110997110100111 101110 10897 11610111410910511097108 11511798109105116 116561181061045651505752561029911097108", asscii.getLettersAndNumbers());
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

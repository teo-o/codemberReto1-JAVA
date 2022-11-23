package Reto_4;

import java.util.ArrayList;
import java.util.List;

public class Contraseña {
    final int MAX = 98123;
    final int MIN = 11098;
    List<Integer> lista = new ArrayList<>();

    public void checkPassword() {
        int cnt5 = 0;
        Boolean flag = false;
        for (int i = MIN; i <= MAX; i++) {
            int[] password = intToArray(i);
            cnt5 = 0;
            for (int j = 0; j < password.length; j++) {
                if(password[j] == 5) {
                    cnt5++;
                }
            }
            if(cnt5>= 2)
            {
                flag = true;
                for (int j = 0; j < password.length-1; j++) {

                    if(!(password[j] <= password[j+1])) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) {
                lista.add(i);
            }
            flag = false;
        }
    }

    public static void main(String[] args) {
        Contraseña c = new Contraseña();
        c.checkPassword();
        System.out.println(c.lista.size()+"".concat("-").concat(c.lista.get(55).toString()));
    }
    public int[] intToArray(int number) {
        int[] result = new int[Integer.toString(number).length()];
        for (int i = result.length-1; i >= 0; i--) {
            result[i] = number % 10;
            number /= 10;
        }
        return result;
    }
}

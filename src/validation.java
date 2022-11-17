import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class validation {
    protected List<HashMap> usersValidated = new ArrayList<>();
    private File archivo;

    public static void main(String[] args) {
        validation validation = new validation();
        validation.usersFill();
        System.out.println(validation.validationForParams());
        //validation.printUsersValidated();

    }

    public void usersFill() {
        String texto = "";
        String[] datos;
        String[] datos2;
        List<HashMap> users = new ArrayList<>();
        try {
            FileReader reader = new FileReader("C:\\Users\\mathe\\IdeaProjects\\codember\\src\\users.txt");
            BufferedReader reading = new BufferedReader(reader);
            while (texto != null) {
                texto = reading.readLine();
                if ((!texto.equals("")) && (!texto.equals(null))) {
                    String texto2 = texto;
                    while (!texto.equals("")) {
                        texto = reading.readLine();
                        if (texto != null) {
                            texto2 += " " + texto;
                        } else {
                            break;
                        }
                    }
                    HashMap user = new HashMap();
                    if (texto2 != null) {
                        datos = texto2.split(" ");
                        for (int i = 0; i < datos.length; i++) {
                            datos2 = datos[i].split(":");
                            user.put(datos2[0], datos2[1]);
                        }
                    }
                    usersValidated.add(user);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error, " + ex);
        } catch (IOException ex) {
            System.err.println("Error, " + ex);
        }
    }

    public int validationForParams() {
        int validUsers = 0;
        HashMap userLast = new HashMap();
        for (int i = 0; i < usersValidated.size(); i++) {
            if (usersValidated.get(i).containsKey("usr") && usersValidated.get(i).containsKey("psw") && usersValidated.get(i).containsKey("eme") && usersValidated.get(i).containsKey("age") && usersValidated.get(i).containsKey("loc") && usersValidated.get(i).containsKey("fll")) {
                validUsers++;
                userLast = usersValidated.get(i);
            }
        }
        System.out.println("userLast = " + userLast);
        return validUsers;
    }

    public void printUsersValidated() {
        for (int i = 0; i < usersValidated.size(); i++) {
            System.out.println(usersValidated.get(i));
        }
    }
}

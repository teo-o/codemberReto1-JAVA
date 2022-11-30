package Reto_5;

import java.util.ArrayList;
import java.util.Arrays;

public class HungerGames {
    String[] frameworksArray = {"Gorusuke",
            "DavidFabian",
            "ItziarZG",
            "edy WOLF",
            "MarcosGaPe",
            "Jose Jimenez",
            "Borja ",
            "Jhonathan Izquierdo Higuita",
            "MiLfeR322",
            "Sebastián Espínola",
            "Matias Luna",
            "Imanol Decima",
            "MarcoCasula",
            "MaríaBohórquez",
            "Renan",
            "IvanL'olivier",
            "Shonero",
            "Luichidev",
            "Faviola Narvaez",
            "Christopher Fuentes",
            "Kuro",
            "Juan Pablo Addeo",
            "Sergio Martínez",
            "Fran Enriquez González",
            "Diana",
            "tictools",
            "ConchaAsensio",
            "Emilio_Arreaza",
            "novamix",
            "Tomas Duclos",
            "Elaya",
            "Ignacio Palominos",
            "David C.",
            "Gerardo Felipe Conrado",
            "ElXuri",
            "David Borja Martinez",
            "JaviFelices",
            "CarlesSànchez",
            "Gorusuke",
            "DavidFabian",
            "ItziarZG",
            "edy WOLF",
            "MarcosGaPe",
            "Jose Jimenez",
            "Borja ",
            "Jhonathan Izquierdo Higuita",
            "MiLfeR322",
            "Sebastián Espínola",
            "Matias Luna",
            "Imanol Decima",
            "MarcoCasula",
            "MaríaBohórquez",
            "Renan",
            "IvanL'olivier",
            "Shonero",
            "Luichidev",
            "Faviola Narvaez",
            "Christopher Fuentes",
            "Kuro",
            "Juan Pablo Addeo",
            "Sergio Martínez",
            "Fran Enriquez González",
            "Diana",
            "tictools",
            "ConchaAsensio",
            "Emilio_Arreaza",
            "novamix",
            "Tomas Duclos",
            "Elaya",
            "Ignacio Palominos",
            "David C.",
            "Gerardo Felipe Conrado",
            "ElXuri",
            "David Borja Martinez",
            "JaviFelices",
            "CarlesSànchez",
            "Gorusuke",
            "DavidFabian",
            "ItziarZG",
            "edy WOLF",
            "MarcosGaPe",
            "Jose Jimenez",
            "Borja ",
            "Jhonathan Izquierdo Higuita",
            "MiLfeR322",
            "Sebastián Espínola",
            "Matias Luna",
            "Imanol Decima",
            "MarcoCasula",
            "MaríaBohórquez",
            "Renan",
            "IvanL'olivier",
            "Shonero",
            "Luichidev",
            "Faviola Narvaez",
            "Christopher Fuentes",
            "Kuro",
            "Juan Pablo Addeo",
            "Sergio Martínez",
            "Fran Enriquez González",
            "Diana",
            "tictools",
            "ConchaAsensio",
            "Emilio_Arreaza",
            "novamix",
            "Tomas Duclos",
            "Elaya",
            "Ignacio Palominos",
            "David C.",
            "Gerardo Felipe Conrado",
            "ElXuri",
            "David Borja Martinez",
            "JaviFelices",
            "CarlesSànchez"
    };
    ArrayList<String> frameworks = new ArrayList<>();
     public void hunger()
     {
         for (int i = 0; i < frameworksArray.length; i++) {
             frameworksArray[i] += "-"+(i);
         }
         while (frameworksArray.length > 1) {
             for (int i = 0; i < frameworksArray.length-1; i+=2) {
                 frameworksArray[i+1] = "";
             }
             frameworks.clear();
             for (int i = 0; i < frameworksArray.length; i++) {
                 if (!frameworksArray[i].equals("")) {
                     frameworks.add(frameworksArray[i]);
                 }

             }
             if (!(frameworksArray[frameworksArray.length-1].equals(""))){
                 frameworks.remove(0);
             }
             frameworksArray = frameworks.toArray(new String[0]);
         }
     }

    public static void main(String[] args) {
        HungerGames hg = new HungerGames();
        hg.hunger();
        System.out.println(hg.frameworks);
    }
}

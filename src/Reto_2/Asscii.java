package Reto_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Asscii {
    List<HashMap> lettersAndNumbers = new ArrayList<>();

    public void completeList(){
        for (int i = 65; i < 91; i++) {
            HashMap letter = new HashMap();
            letter.put(i, (char)i);
            lettersAndNumbers.add(letter);
        }
        for (int i = 97; i < 123; i++) {
            HashMap letter = new HashMap();
            letter.put(i, (char)i);
            lettersAndNumbers.add(letter);
        }
        for (int i = 48; i < 58; i++) {
            HashMap letter = new HashMap();
            letter.put(i, (char)i);
            lettersAndNumbers.add(letter);
        }
    }

    public List<HashMap> getLettersAndNumbers() {
        return lettersAndNumbers;
    }
}

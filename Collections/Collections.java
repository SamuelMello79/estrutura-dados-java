package Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        
        List<String> nome = new ArrayList<>();
        nome.add("Java");
        nome.add("Python");
        System.out.println(nome.subList(0, 1));
    }
}

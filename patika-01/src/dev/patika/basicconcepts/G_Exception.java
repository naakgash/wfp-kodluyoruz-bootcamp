package dev.patika.basicconcepts;

import java.util.Objects;

public class G_Exception {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        //System.out.println(x / y);

        String test = null;
        if(Objects.nonNull(test))
            test = test.toUpperCase();
    }
}

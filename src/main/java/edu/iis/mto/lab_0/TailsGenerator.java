package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> tails = new ArrayList<>(value.length() + 1);
        for (int index = 0; index < value.length() + 1; index++) {
            tails.add(value.substring(index));
        }

        return tails;
    }

}

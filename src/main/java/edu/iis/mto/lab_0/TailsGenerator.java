package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> tailst_t = new ArrayList<>(value.length() + 1);
        for (int i = 0; i < value.length(); i++) {
            tailst_t.add(value);
        }
        tailst_t.add("");
        return tailst_t;
    }

}

package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> substrings = new ArrayList<>(value.length());

        for (int i = value.length(); i >= 0; i--) {
            substrings.add(value.substring(0, i));
        }

        return substrings;
    }

}

package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> valueSubstrings = new ArrayList<>(value.length());
        for (int i = value.length(); i >= 0; i--) {
            valueSubstrings.add(value.substring(0, i));
        }
        return valueSubstrings;
    }

}

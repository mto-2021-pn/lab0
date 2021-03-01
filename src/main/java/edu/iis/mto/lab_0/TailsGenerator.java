package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> substrings = new ArrayList<>();
        int valueLength = value.length();
        for (int exclusiveIndex = valueLength; exclusiveIndex >= 0; --exclusiveIndex) {
            substrings.add(value.substring(0, exclusiveIndex));
        }
        return substrings;
    }

}

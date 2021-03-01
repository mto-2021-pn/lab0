package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> newList = new ArrayList<>(value.length() + 1);
        newList.add(0, value);
        for (int i = 1; i < value.length() + 1; i++) {
            newList.add(i, "");
        }
        return newList;
    }

}

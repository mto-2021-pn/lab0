package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> list = new ArrayList<>(value.length());
        list.add(value);
        for (int i = 0; i < value.length() - 1; i++)
            list.add(value);
        list.add("");
        return list;
    }

}

package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {
    public List<String> tails(String value) {
        ArrayList<String> list = new ArrayList<>(value.length());
        list.add(value);
        for(int i = 0;i<value.length();i++){
            list.add("");
        }
        return list;
    }
}

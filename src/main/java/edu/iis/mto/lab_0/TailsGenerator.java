package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {
    public List<String> tails(String value) {
        List<String> returnValue = new ArrayList<>(value.length());
        returnValue.add(value);
        for(int i = 0;i<value.length();i++){
            returnValue.add("");
        }
        return returnValue;
    }
}

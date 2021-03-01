package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> toReturnValue =  new ArrayList<>(value.length());
        toReturnValue.add(value);
        for (int i = 1; i <= value.length(); i++) {
            toReturnValue.add("");
        }
        return toReturnValue;

    }

}

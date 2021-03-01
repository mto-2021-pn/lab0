package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> ret = new ArrayList<>(value.length() + 1);
        ret.add(0, value);
        for (int i = 1; i < value.length() + 1; i++) {
            ret.add(i, "");
        }
        return ret;
    }

}

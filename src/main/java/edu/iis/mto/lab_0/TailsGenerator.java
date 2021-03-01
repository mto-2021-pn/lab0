package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> list = new ArrayList<>(value.length());
        for(int i=0;i<value.length()+1;i++){
            if(i==value.length())
                list.add("");
            else
                list.add(value);
        }
        return list;
    }

}

package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String base){
        List<String> tail = new ArrayList<String>();
        for(int i = 0; i<base.length(); i++){
            tail.add(base.substring(i));
        }
        tail.add("");
        return tail;
    }

}
package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        List<String> resultList = new ArrayList<>();
        int length = value.length();
        for(int counter = length; counter >= 0; counter--){
            resultList.add(value.substring(0, counter));

        }
        return resultList;
    }

}

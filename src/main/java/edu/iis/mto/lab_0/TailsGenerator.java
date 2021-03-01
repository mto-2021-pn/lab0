package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> returnList = new ArrayList<String>();

        for(int i=0; i<=value.length(); i++){
            returnList.add(value.substring(i, value.length()));
        }
        System.out.println(returnList);

        return returnList;
    }

}

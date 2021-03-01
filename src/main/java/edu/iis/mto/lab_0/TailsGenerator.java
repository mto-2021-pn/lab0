package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        // stworzona nowa lista i dodano po koleji stringi do tej nowej listy, ostatni string jest pusty
        List<String> returnList = new ArrayList<String>();
        for(int i=0; i<=value.length(); i++){
            returnList.add(value.substring(i, value.length()));
        }

        return returnList;
    }

}

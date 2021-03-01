package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        // stworzona nowa lista slow
        // dodano po koleji stringi do tej nowej listy, ostatni string jest pusty
        List<String> returnListOfStrings = new ArrayList<String>();
        for(int i=0; i<=value.length(); i++){
            returnListOfStrings.add(value.substring(i, value.length()));
        }

        return returnListOfStrings;
    }

}

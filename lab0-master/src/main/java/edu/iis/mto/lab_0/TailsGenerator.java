package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {
	
    public  List<String> tails(String value) {
        ArrayList<String> tailList = new ArrayList(value.length());
        for(int i=0; i<=value.length(); i++){
            tailList.add(value.substring(0, value.length() - i));
        }
        return tailList;
    }
}

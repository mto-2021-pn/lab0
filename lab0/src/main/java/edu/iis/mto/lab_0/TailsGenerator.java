package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public  List<String> tails(String value) {
        ArrayList<String> list = new ArrayList(value.length());
        for(int i=0; i<=value.length(); i++){
            list.add(value.substring(0, value.length() - i));
        }
        for(String s: list){
            System.out.println(s);
        }

        return list;
    }
}

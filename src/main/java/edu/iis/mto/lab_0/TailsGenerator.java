package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

  public List<String> tails(String value) {
    ArrayList<String> list = new ArrayList<>();
    int counter = value.length();

    for (int i = 0; i < counter + 1; i++) {
      if (i == 0) {
        list.add(value);
      } else {
        list.add("");
      }
    }
    return list;
  }
}

package com.ingcremonini;

import java.util.ArrayList;
import java.util.List;

/**
 * Multithreaded class with problems to test
 * Created by Daniele Cremonini on 05/03/17.
 */
public class MTProblem {

    private List<String> names;

    public static final int MAX_NUMBER_OF_NAMES = 100;
    public int totalCalls = 0;

    public MTProblem() {
        this.names = new ArrayList<String>();
    }

    public MTProblem(List<String> names) {
        this.names = names;
    }

    public void addName(String name) {
        totalCalls++;
        if (names.size()<MAX_NUMBER_OF_NAMES) {
            names.add(name);
        }
    }


    // Getters and setters

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }


}

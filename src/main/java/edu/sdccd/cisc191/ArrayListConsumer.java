package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer {


    private ArrayList<String>testList;



    public ArrayListConsumer(ArrayList<String> testList) {
        this.testList = testList;
    }

    public String consume() {


        return testList.remove(0);
    }

}
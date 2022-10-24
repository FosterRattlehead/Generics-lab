package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer
{
    private ArrayList<String>testList;

    public ArrayListProducer(ArrayList<String> testList) {
        this.testList = testList;
    }

    public void produce(int i, String string)
    {
        testList.add(i,string);

    }

}
package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapProducer {
    private HashMap<String,String> testMap;

    public HashMapProducer(HashMap<String, String> testMap) {
        this.testMap = testMap;
    }

    public void produce(String langOne, String langTwo) {
        testMap.put(langOne,langTwo);
    }



}

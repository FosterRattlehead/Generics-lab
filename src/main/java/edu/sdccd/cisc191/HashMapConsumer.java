package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapConsumer {
    private HashMap<String,String> testHash;

    public HashMapConsumer(HashMap<String, String> testHash) {
        this.testHash = testHash;
    }

    public String consume(String returnTestString) {
        return testHash.get(returnTestString);
    }



}

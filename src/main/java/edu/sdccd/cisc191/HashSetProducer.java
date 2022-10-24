package edu.sdccd.cisc191;


import java.util.HashSet;

public class HashSetProducer {
    private HashSet<String> testHashSet;

    public HashSetProducer(HashSet<String> testHashSet) {
        this.testHashSet = testHashSet;
    }


    public boolean produce(String testSetHash) {
       return testHashSet.add(testSetHash);
    }


}

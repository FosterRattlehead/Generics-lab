package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetConsumer {
    private HashSet<String> hashSetTest;

    public HashSetConsumer(HashSet<String> hashSetTest) {
        this.hashSetTest = hashSetTest;
    }

public boolean consume (String testHash) {
        return hashSetTest.remove(testHash);


}


}

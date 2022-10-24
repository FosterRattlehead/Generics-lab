package edu.sdccd.cisc191;

public class ArrayProducer {
    String[] testArray;

    public ArrayProducer(String[] testArray) {
        this.testArray = testArray;
    }
    public void produce(int numLocation, String testString) {
        testArray[numLocation]=testString;

    }
}

package edu.sdccd.cisc191;

public class ArrayConsumer {
    String[] arrayTest;
    int arrayIndex =0;

    public ArrayConsumer(String[] arrayTest) {
        this.arrayTest = arrayTest;
    }
// it moves to the next index
    public String consume() {
        String temp="";
        temp=arrayTest[arrayIndex];
        arrayIndex++;
        return temp;
    }
}

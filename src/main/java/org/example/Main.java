package org.example;

public class Main {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        Heapsort heapsort = new Heapsort();
        heapsort.printArray(heapsort.sort(sortArr));
    }
}
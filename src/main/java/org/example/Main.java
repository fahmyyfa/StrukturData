package org.example;

public class Main {
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(10);
        q.printQueue();

        q.insert(2, 15);
        q.printQueue();

        q.insert(7, 70);
        q.printQueue();
    }
}

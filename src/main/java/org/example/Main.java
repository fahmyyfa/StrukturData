package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nCustom Queue");
        CustomQueue q = new CustomQueue(10);
        q.printQueue();
        q.insert(2, 15);
        q.printQueue();
        q.insert(7, 70);
        q.printQueue();

        System.out.println("\nCircular Queue");
        CircularQueue cq = new CircularQueue(10);
        cq.insert(0, 5);
        cq.insert(1, 10);
        cq.insert(2, 15);
        cq.insert(1, 20); //20 mengganti 10 yang sebelumnya
        cq.show();
    }
}

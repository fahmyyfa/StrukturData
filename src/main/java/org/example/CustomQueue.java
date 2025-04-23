package org.example;
public class CustomQueue {
    int[] queue;
    int front;
    int rear;

    public CustomQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = 6;
        queue[0] = 0;
        queue[1] = 10;
        queue[2] = 20;
        queue[3] = 30;
        queue[4] = 40;
        queue[5] = 50;
    }

    public void insert(int number, int data) {
        if (number < 0 || number > queue.length - 1) {
            System.out.println("Index di luar batas!");
            return;
        }

        if (queue[number] == 0) {
            queue[number] = data;
            if (number > rear) rear = number;
        } else {
            for (int i = rear; i >= number; i--) {
                if (i + 1 < queue.length) {
                    queue[i + 1] = queue[i];
                }
            }
            queue[number] = data;
            rear++;
        }
    }

    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
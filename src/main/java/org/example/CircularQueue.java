package org.example;

public class CircularQueue {
    private int[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void insert(int index, int value) {
        if (isFull()) {
            System.out.println("Queue penuh. Tidak bisa menambahkan data.");
            return;
        }

        if (index < 0 || index >= capacity) {
            System.out.println("Index di luar jangkauan.");
            return;
        }

        if (isEmpty()) {
            front = rear = index;
            data[index] = value;
        } else {
            if (data[index] == 0) {
                data[index] = value;
                rear = (rear + 1) % capacity;
            } else {
                int i = rear;
                while (true) {
                    int next = (i + 1) % capacity;
                    if (next == front) break;
                    data[next] = data[i];
                    i = (i - 1 + capacity) % capacity;
                    if (i == index) break;
                }

                data[index] = value;
                rear = (rear + 1) % capacity;
            }
        }
        size++;
    }

    public void show() {
        System.out.print("Circular Queue: ");
        for (int i = 0; i < capacity; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
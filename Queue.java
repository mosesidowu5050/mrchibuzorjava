package dataStructuresFolder;

public class Queue {
    private int count;
    private int[] queue;

    public Queue(int size) {
        this.queue = new int[size];
        this.count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public int enqueue(int value) {
        if (count >= queue.length) {
            throw new IllegalArgumentException("Queue is full");
        }
        queue[count] = value;
        count++;
        return count;
    }

    public int dequeue() {
        if (count == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        int value = queue[0];
        for (int count = 1; count < this.count; count++) {
            queue[count - 1] = queue[count];
        }
        count--;
        return value;
    }

    public int peekFront() {
        if (count == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return queue[0];
    }

    public int getSize() {
        return count;
    }

    public int search(int indexValue) {
        for (int count = 0; count < this.count; count++) {
            if (queue[count] == indexValue) {
                return count;
            }
        }
        throw new IllegalArgumentException("Element not found in the queue");
    }
}

package dataStructuresFolder;

public class Stacks {
    private int countingElements;
    private int[] stacks;

    public Stacks(int initialSize) {
        this.stacks = new int[initialSize];
        this.countingElements = 0;
    }

    public boolean isEmpty() {
        return countingElements == 0;
    }

    public boolean isFull() {
        return countingElements == stacks.length;
    }

    private void resize() {
        int newSize = stacks.length * 2;
        int[] newStack = new int[newSize];
        System.arraycopy(stacks, 0, newStack, 0, stacks.length);
        stacks = newStack;
    }

    public int pushToStack(int value) {
        if (isFull()) {
            resize();
        }
        stacks[countingElements] = value;
        countingElements++;
        return countingElements;
    }

    public int popElementFromBack() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        countingElements--;
        return stacks[countingElements];
    }

    public int peekFromTop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        return stacks[countingElements - 1];
    }

    public int getSize() {
        if (isEmpty()) {
            throw new IllegalArgumentException("No elements in stack");
        }
        return countingElements;
    }

    public int search(int value) {
        for (int count = 0; count < countingElements; count++) {
            if (stacks[count] == value) {
                return count;
            }
        }
        throw new IllegalArgumentException("Element not available in the stack");
    }
}

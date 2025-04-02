package CollectionsOfData;

public class Stacks {
    private int countingElements;
    private int[] stacks;

    public Stacks(int size) {
        this.stacks = new int[size];
        this.countingElements = 0;
    }
    public boolean is_Empty() {
        return countingElements == 0;
    }

    public int push(int value) {
        if (countingElements >= stacks.length) {
            throw new IllegalArgumentException("Stack is full");
        }
          stacks[countingElements] = value;
          countingElements++;
        return countingElements;
    }

    public int pop() {
        if (countingElements == 0) {
            throw new IllegalArgumentException("Stack is empty");
        }
            countingElements--;
        return stacks[countingElements];
        }

    public boolean is_Full() {
        return countingElements == stacks.length;
    }

    public int getSize() {
        if (countingElements == 0) {
            throw new IllegalArgumentException("No elements in stack");
        }
        return countingElements;
    }

    public int peek() {
        if (countingElements == 0) {
            throw new IllegalArgumentException("Stack is empty");
        }
        return stacks[countingElements - 1];
    }

    public int search(int value) {
        for (int count = 0; count < stacks.length; count++) {
            if (stacks[count] == value) {
                return count;
            }
        }
           throw new IllegalArgumentException("Elements not available in the stack");
        }

/*    public void maximumParameter(int ... args) {
        if (args.length > 1) {
            throw new IllegalArgumentException("Expected 1 argument but 3 seen");
        }
    }*/
}


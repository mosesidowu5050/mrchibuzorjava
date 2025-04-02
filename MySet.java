package CollectionsOfData;

public class MySet {
    private int numbersOfElements;
    private int[] set;

    public MySet() {
    this.numbersOfElements = 0;
    this.set = new int[3];
    }
    public boolean isEMpty() {
        return numbersOfElements == 0;
    }

    public boolean add(int elements) {
    for(int count = 0; count < numbersOfElements; count++) {
        if (set[count] == elements) {
            return false;
        }
    }
    if(numbersOfElements == set.length) {
        resizeSet();
    }
        set[numbersOfElements] = elements;
        numbersOfElements++;
        return true;
    }

    public void resizeSet() {
        int newSize = numbersOfElements * 2;
        int[] newArrayLists = new int[newSize];
        for(int count = 0; count < numbersOfElements; count++) {
        newArrayLists[count] = set[count];
    }
        set = newArrayLists;
    }

    public int sizeOfSet() {
        if(numbersOfElements == 0) {
            throw new IllegalArgumentException("Number of elements is 0");
        }
        numbersOfElements++;
        return numbersOfElements;
    }

    public boolean contains(int elements) {
        for(int count = 0; count < numbersOfElements; count++) {
            if(set[count] == elements) {
                return true;
            }
        }
        return false;
    }

    public int remove(int removeElement) {
        for(int count = 0; count < numbersOfElements; count++) {
            if (set[count] == removeElement) {
                numbersOfElements--;
                return set[count];
            }
        }
        throw new IllegalArgumentException("Element not in set");
    }
}


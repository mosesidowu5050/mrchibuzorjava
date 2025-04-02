package CollectionsOfData;

import java.util.ArrayList;

public class ArrayLists {
    private int numbersOfElements;
    private int[] arrayLists;

    public ArrayLists() {
        this.numbersOfElements = 0;
        this.arrayLists = new int[3];
    }

    public boolean is_Empty() {
        return numbersOfElements == 0;
    }

    public int add(int element) {
        if(numbersOfElements >= arrayLists.length) {
            resize();
        }
        arrayLists[numbersOfElements] = element;
        numbersOfElements++;
        return numbersOfElements;
        }

    public void resize() {
        int newSize = arrayLists.length * 2;
        int[] newArrayLists = new int[newSize];

        for(int count = 0; count < arrayLists.length; count++) {
            newArrayLists[count] = arrayLists[count];
        }
        arrayLists = newArrayLists;
    }

    public int theLength() {
        if(numbersOfElements == 0) {
            throw new IllegalArgumentException("You have to add at least one element");
        }
        return numbersOfElements++;
    }

    public int getIndex(int indexNumber) {
        for (int count = 0; count < arrayLists.length; count++) {
            if (count == indexNumber) {
                arrayLists[count] = arrayLists[count];
                return arrayLists[count];
            }
        }
        for (int count = 0; count < arrayLists.length; count++) {
            if (indexNumber > count) {
                throw new IllegalArgumentException("Array Index out of bounds");
            }
        }
        return -1;
    }

    public int removeElement(int removeElement) {
        for (int count = 0; count < arrayLists.length; count++) {
            if (count == removeElement) {
                arrayLists[count] = arrayLists[count];
                numbersOfElements--;
                return arrayLists[count];
            }
        }
        for (int count = 0; count < arrayLists.length; count++) {
            if (removeElement > count) {
                throw new IllegalArgumentException("Array Index out of bounds");
            }
        }
        return -1;
    }

    public int inludes(int containsElements) {
        for (int arrayList : arrayLists) {
            if (arrayList == containsElements) {
                return arrayList;
            }
        }
         throw new IllegalArgumentException("Element not included");
    }

    public boolean clearElements() {
        numbersOfElements = 0;
        for (int count = 0; count < arrayLists.length; count++) {
            arrayLists[count] = 0;
        }
        return true;
    }
}


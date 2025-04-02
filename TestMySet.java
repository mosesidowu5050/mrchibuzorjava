package TestsFiles;

import CollectionsOfData.MySet;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMySet {
    MySet uniqueSet = new MySet();

    @Test
    public void testThatCheckIfMySetIsEmpty() {
        assertTrue(uniqueSet.isEMpty());
    }
    @Test
    public void testThatOneAddElementToMySet() {
        uniqueSet.add(34);
        assertFalse(uniqueSet.isEMpty());
    }
    @Test
    public void testThatAddTwoElementsToMySet() {
        uniqueSet.add(3);
        uniqueSet.add(56);
        assertFalse(uniqueSet.isEMpty());
    }
    @Test
    public void testThatCheckIfElementAlreadyExistsInMySet() {
        uniqueSet.add(34);
        uniqueSet.add(56);
        assertFalse(uniqueSet.add(34));
    }
    @Test
    public void testThatCheckIfElementsDoesNotExistBeforeInMySet() {
        uniqueSet.add(467);
        uniqueSet.add(134);
        assertTrue(uniqueSet.add(456));
    }
    @Test
    public void testThatCheckTheResizeOfMySet() {
        uniqueSet.add(34);
        uniqueSet.add(56);
        uniqueSet.add(12);
        uniqueSet.add(34);
        assertEquals(4, uniqueSet.sizeOfSet());
    }
    @Test
    public void testThatThrowsExceptionIfSizeOfSetIsZero() {
        assertThrows(IllegalArgumentException.class, () -> uniqueSet.sizeOfSet());
    }
    @Test
    public void testThatCheckIfSetContainsASpecificElement() {
        uniqueSet.add(9);
        uniqueSet.add(4);
        uniqueSet.add(1);
        assertTrue(uniqueSet.contains(1));
        assertTrue(uniqueSet.contains(9));
        assertTrue(uniqueSet.contains(4));
    }
    @Test
    public void testThatCheckIfSetDoesntContainsASpecificElement() {
        uniqueSet.add(9);
        uniqueSet.add(34);
        assertFalse(uniqueSet.contains(19));
        assertFalse(uniqueSet.contains(4));
    }
    @Test
    public void testThatRemoveASpecificElementsInTheSet(){
        uniqueSet.add(5);
        uniqueSet.add(12);
        assertEquals(12, uniqueSet.remove(12));
        assertEquals(5, uniqueSet.remove(5));
    }
    @Test
    public void testThatThrowsExceptionIfElementIsNotInTheSet() {
        uniqueSet.add(23);
        uniqueSet.add(12);
        assertThrows(IllegalArgumentException.class, () -> uniqueSet.remove(234));
    }
}


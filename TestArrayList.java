package TestsFiles;

import CollectionsOfData.ArrayLists;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArrayList {
    ArrayLists arrayLists = new ArrayLists();

    @Test
    public void testThatCheckIfArrayList_isEmpty() {
        assertTrue(arrayLists.is_Empty());
    }

    @Test
    public void testThatAddOneElement_intoArrayList() {
        assertEquals(1, arrayLists.add(4));
    }

    @Test
    public void testThatAddTwoElements_intoArrayLists() {
        assertEquals(1, arrayLists.add(56));
        assertEquals(2, arrayLists.add(23));
    }

    @Test
    public void testThatResizeTheLength_ofTheArrayList() {
        arrayLists.add(4);
        arrayLists.add(56);
        arrayLists.add(10);
        arrayLists.add(3);
        arrayLists.add(23);
        assertEquals(6, arrayLists.add(7));
    }
    @Test
    public void testThatCheckLength_ofTheArrayLIst(){
        arrayLists.add(11);
        arrayLists.add(33);
        arrayLists.add(23);
        assertEquals(3, arrayLists.theLength());
    }
    @Test
    public void testThatCheckLengthOfTheArrayList_ifItIsEmpty(){
        assertThrows(IllegalArgumentException.class, () -> {
            arrayLists.theLength();
        });
    }
    @Test
    public void testThatGetTheIndexNumber_ofAnElement(){
        arrayLists.add(4);
        arrayLists.add(56);
        arrayLists.add(10);
        arrayLists.add(3);
        assertEquals(10, arrayLists.getIndex(2));
    }
    @Test
    public void testThatThrowException_ifIndexNumberIsOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> {
            arrayLists.getIndex(9);
        });
    }
    @Test
    public void testThatRemoveSpecificElement_atTheSpecifiedIndex() {
        arrayLists.add(12);
        arrayLists.add(56);
        assertEquals(12, arrayLists.removeElement(0));
    }
    @Test
    public void testThatThrowException_ifRemoveIndexIsOutOfBound(){
        assertThrows(IllegalArgumentException.class, ()-> {
           arrayLists.removeElement(8);
        });
    }
    @Test
    public void testThatCheckIfTheArrayList_containsTheSpecifiedElement() {
        arrayLists.add(132);
        arrayLists.add(56);
        assertEquals(56, arrayLists.inludes(56));
    }
    @Test
    public void testThatThrowsException_ifArrayListDoesntContainElement() {
    arrayLists.add(132);
     assertThrows(IllegalArgumentException.class, ()-> {
            arrayLists.inludes(121);
        });
    }
    @Test
    public void testThatClearAllElements_inTheArrayList(){
        arrayLists.add(23);
        arrayLists.add(56);
        assertTrue(arrayLists.clearElements());
    }
}

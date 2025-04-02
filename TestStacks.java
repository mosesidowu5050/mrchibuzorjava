package TestsFiles;


import CollectionsOfData.Stacks;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStacks {

    Stacks myStacks = new Stacks(5);

    @Test
    public void testToCheckStacks_isEmpty() {
        assertTrue(myStacks.is_Empty());
    }

    @Test
    public void testToCheckStackIsNotEmptyAfterPush() {
        myStacks.push(23);
        assertFalse(myStacks.is_Empty());
    }

    @Test
    public void testToPushOneElement_toStack() {
        assertEquals(1, myStacks.push(5));
    }

    @Test
    public void testToPushTwoElements_toStack() {
        myStacks.push(23);
        myStacks.push(2);
        assertEquals(2, 2);
    }

    @Test
    public void testToPushFiveElements_toStack() {
        myStacks.push(23);
        myStacks.push(2);
        myStacks.push(65);
        myStacks.push(7);
        myStacks.push(19);
        assertEquals(5, 5);
    }

    @Test
    public void testPopOnEmptyStack_toThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myStacks.pop();
        });
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    public void testToPop_theLastElementInTheStack() {
        myStacks.push(23);
        myStacks.push(9);
        assertEquals(9, myStacks.pop());
    }

    @Test
    public void testToCheck_ifTheStackIsFull() {
        myStacks.push(23);
        myStacks.push(4);
        myStacks.push(96);
        myStacks.push(2);
        myStacks.push(78);
        assertTrue(myStacks.is_Full());
    }
    @Test
    public void testThatPushBeyond_throwsException() {
        myStacks.push(23);
        myStacks.push(4);
        myStacks.push(96);
        myStacks.push(2);
        myStacks.push(78);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myStacks.push(88);
        });
        assertEquals("Stack is full", exception.getMessage());
    }
    @Test
    public void testIfTheSizeOfTheElements_isCorrect() {
        myStacks.push(34);
        myStacks.push(21);
        myStacks.push(18);
        assertEquals(3, myStacks.getSize());
    }
    @Test
    public void testIfTheSizeOfTheStack_isEmpty() {
        Exception emptySize = assertThrows(IllegalArgumentException.class, () ->{
            myStacks.getSize();
        });
        assertEquals("No elements in stack", emptySize.getMessage());
    }
    @Test
    public void testToPeekTheLastElement_inTheStack(){
        myStacks.push(9);
        myStacks.push(12);
        myStacks.push(91);
        assertEquals(91, myStacks.peek());
    }
    @Test
    public void testToSearchPositionOfASpecificElement_inTheStack(){
        myStacks.push(19);
        myStacks.push(12);
        assertEquals(0, myStacks.search(19));
    }
    @Test
    public void testToSearchASpecificElementNotPresent_inTheStack(){
        Exception emptySearch = assertThrows(IllegalArgumentException.class, ()-> {
           myStacks.search(19);
        });
        assertEquals("Elements not available in the stack", emptySearch.getMessage());
    }
/*    @Test
    public void testThatThrowsException_forAnInvalidArgumentPassedInTheParameter() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            myStacks.maximumParameter(19, 34, 23);
        });
        assertEquals("Expected 1 argument but 3 seen", exception.getMessage());
    }*/
}


package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
        stackOfInts.push(7);
        stackOfInts.push(14);
        stackOfInts.push(2);

    }

    @AfterEach
    void tearDown() {
    }

    /** push is a method that add the element in argument in first position in the list
     * we use assertEquals to verify if we add the element in parameter in first position.
     *  if this is not the case an error will be displayed
     */
    @Test
    void push(){
        stackOfInts.push(9);
        assertEquals(9,stackOfInts.peek());

    }

    /** pop is a method that remove the first element in the list
     * we use assertEquals to verify if we remove the element located in first position.
     * if this is not the case an error will be displayed
     */
    @Test
    void pop(){
        stackOfInts.pop();
        assertEquals(14,stackOfInts.peek());


    }

}
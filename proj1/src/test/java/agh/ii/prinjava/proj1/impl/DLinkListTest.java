package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest<E> {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        dLinkList.addFirst(8);
        dLinkList.addFirst(2);
        dLinkList.addLast(1);
    }

    @AfterEach
    void tearDown() {
    }

    /** addFirst is a method that add the element in argument in first position in the list
     * we use assertEquals to verify if we add the element in parameter in first position.
     * if this is not the case an error will be displayed
     */
    @Test
    void addFirst(){
        dLinkList.addFirst(6);
        assertEquals(6,dLinkList.firstElem());
    }

    /** addLast is a method that add the element in argument in last position in the list
     * we use assertEquals to verify if we add the element in parameter in last position.
     *  if this is not the case an error will be displayed
     */
    @Test
    void addLast(){
        dLinkList.addLast(6);
        assertEquals(6,dLinkList.lastElem());
    }

    /**
     * removeFirst is a method that remove the first element in the list
     * we use assertEquals to verify if we remove the element located in first position.
     * if this is not the case an error will be displayed
     * @param <E>
     */
    @Test
    <E> void removeFirst(){
        assertEquals(2, dLinkList.removeFirst());
        assertEquals(8,dLinkList.firstElem());
    }

    /**
     * removeLast is a method that remove the last element in the list
     * we use assertEquals to verify if we remove the element located in last position.
     * if this is not the case an error will be displayed
     * @param <E>
     */
    @Test
    <E> void removeLast(){
        assertEquals(1, dLinkList.removeLast());
        assertEquals(8,dLinkList.lastElem());
    }
}
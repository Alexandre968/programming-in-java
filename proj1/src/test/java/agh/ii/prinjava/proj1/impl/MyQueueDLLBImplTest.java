package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {

        queueOfInts.enqueue(8);
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(2);
    }

    @AfterEach
    void tearDown(){
    }


    /** enqueue is a method that add the element in argument in last position in the list like a queue in supermarket
     * if you arrive in fourth in the queue, you can enter, in the store, after the first three.
     * we use assertEquals to verify if we add the element in parameter in last position.
     *  if this is not the case an error will be displayed
     */
    @Test
    void enqueue(){

        queueOfInts.enqueue(7);
        assertEquals(7,queueOfInts.peek());

    }

    /** dequeue is a method that remove the first element in the list like a queue in supermarket
     * the first ones in the queue can enter in the store.
     * we use assertEquals to verify if we remove the element located in first position.
     * if this is not the case an error will be displayed
     */
    @Test
    void dequeue(){

        queueOfInts.dequeue();
        assertEquals(5,queueOfInts.peek2());

    }
}
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * enqueue is a method that add the element in parameter in last position of the list.
     * @param x
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * dequeue is a method that remove the element located in first position of the list
     * @return
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /**
     * numOfElem is a method that return the length of the list
     * @return
     */
    @Override
    public int numOfElems() {
        return elems.numOfElem();
    }

    /**
     * peek is a method that return the element located in last position in the list
     * @return
     */
    @Override
    public E peek() {
        return elems.lastElem();
    }

    /**
     * peek2 is a method that return the element located in first position in the list
     * @return
     */
    @Override
    public E peek2() {
        return elems.firstElem();
    }

    @Override
    public String toString(){
        return elems.toString();
    }
}

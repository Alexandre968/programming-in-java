package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * pop is a method that remove the element located in first position of the list
     * @return
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }


    /**
     * push is a method that add the element in parameter in first position of the list.
     * @param x
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
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
     * peek is a method that return the element located in first position in the list
     * @return
     */
    @Override
    public E peek() {
        return elems.firstElem();
    }

    @Override
    public String toString(){
        return elems.toString();
    }
}

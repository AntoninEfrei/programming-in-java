package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> datas;

    /**
     * The constructor allow the class MyStackDLLBImpl to create link with the DLinkList class
     * MyStackDLLBImpl is composed of a DLinkList object
     */
    public MyStackDLLBImpl() { this.datas = new DLinkList<>(); }

    /**
     * We push and pop at the beginning of the stack
     * @param a
     *          which we push in and then pop out
     */
    @Override
    public void push(E a) { datas.addFirst(a); }
    
    @Override
    public void pop() { datas.removeFirst();}

    /**
     * peek() method in Java is used to retrieve the element present at the top of the Stack
     * @return
     *          the first element
     */

    @Override
    public E peek() { return datas.returnFirstElem(); }
    /*
    @Override
    public int numOfElems() {  }
     */
}

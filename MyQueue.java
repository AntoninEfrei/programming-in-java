package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {

    /**
     * used for queue tests (aren't made)
     * @param a
     */
    void enqueue(E a);
    void dequeue();

    /**
     * We use them for the test class
     * @return
     */
    E getFirstElem();
    E peek();
    int numOfElems();
    default boolean isEmpty() {return numOfElems() == 0;}


    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {return new MyQueueDLLBImpl<>();}
}

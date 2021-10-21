package agh.ii.prinjava.proj1.impl;


/**
 *
 * Head first element of our list
 * @param <E>
 */
public class DLinkList<E> {


    /**
     * Class Node used in our list
     * @param <T>
     *          Data Type;
     */
    private static class Node<T> {

        T data;
        Node<T> next;
        Node<T> prev;

        /**
         *
         * @param elem
         *         new elem
         * @param next
          *         next become null
          * @param elem
          *         prev become null
         */
        public Node(T elem) {
            this.data = elem;
            this.next = null;
            this.prev = null;
        }
    }


    Node<E> head;

    /**
     *  We create a new node, we link him with the ancient head
     * If the list is empty or not, we set the new node as head
     *
     * @param data
     */
    public void addFirst(E data) {

        Node<E> n = new Node<>(data);
        if (head == null) {

            head = n;

        }
        else {

            n.next = head;
            head.prev = n;
            head = n;
        }

    }
    /**
     * Creating a new node with his data
     * Checking is the List is empty, if so head = freshly created Node
     * Else we create a pt which will scan the whole list until it finds the end of it.(while)
     * At the end of the list we replace the null by the new node created at the beginning.
     */
    public void addLast(){

        Node<E> n = new Node<>(data);
        n.data =

        if (head==null){
            head=n;
        }else{
            Node<E> pt = head;
            while( pt.next != null){
                pt = pt.next;
            }
            pt.next = n;
            n.prev = pt;
        }

    }

    /**
     * 1/List is empty we throw exception
     * 2/One elem the head Node is -> null
     * 3/List is has more than 1 data the next element become the head
     */
    public void removeFirst() {

        if (head == null) { throw new IllegalStateException("LIST HAS NO ELEMENTS :/"); }

        else if (head.next == null) {

            head = null;
        }

        else {

            head = head.next;
            head.prev = null;

        }
    }

    /**
     * 1/ List is empty we throw exception
     * 2/ One element the head Node -> null
     * 3/List has more than one element, we scan through the list with a pt element to the end
     * 4/ Then it deletes the last.
     */
    public void removeLast() {

        if (head == null) {throw new IllegalStateException("LIST HAS NO ELEMENTS :/");}

        else if (head.next == null) {
            head = null ;

        }
        else {
            Node<E> tempo = head;
            while (tempo.next.next != null) {

                tempo = tempo.next ;
            }

            tempo.next = null;
        }

    }



    /**
     *
     * @return  }. the end of the string's printed list
     * We use a new node 'tempo' to scan the whole list and then convert it in String to print it
     */
    @Override
    public String toString() {

        Node tempo= head;

        System.out.println("DLinkList is : {");

        while (tempo != null) {

            System.out.println(tempo.data);
            tempo = tempo.next;

        }
        
        return ("}.");
    }
}
    public E returnFirstElem(){
            return head.data;
    }


    public E returnLastElem(){
            Node<E> tempo = head;
            while (tempo.next.next != null) {

                tempo = tempo.next ;
            }

            return tempo.next.data;
        }
    }





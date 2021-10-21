package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    
    DLinkList<Integer> dLinkList = new DLinkList<>();

    /**
     * From the BeforeEach we set the list to 1/2/3 to test
     */
    @BeforeEach
    void setUp() {

        dLinkList.addFirst(3);
        dLinkList.addFirst(2);
        dLinkList.addFirst(1);
    }

    /**
     * This test use a method that add a number to the 1st place of the list
     */
    @Test
    void Test_addFirst(){

    }
        dLinkList.addFirst(512);
        Assertions.assertEquals(512,dLinkList.returnFirstElem());

    }

    /**
     * We remove the first data and test if we find 2 (List is now 2/3)
     */
    @Test
    void Test_removeFirst(){
        dLinkList.removeFirst();
        Assertions.assertEquals(2,dLinkList.returnFirstElem());
    }

    /**
     *We do the same as the previous test but by removing so we still find 2. (List is now 1/2)
     */
    @Test
    void Test_removeLast(){
        dLinkList.removeLast();
        Assertions.assertEquals(2,dLinkList.returnLastElem());

    }





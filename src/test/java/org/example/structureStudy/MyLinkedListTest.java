package org.example.structureStudy;

import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;


/**
 * @author downey
 *
 */
public class MyLinkedListTest extends MyArrayListTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeAll
    public static void setUp() throws Exception {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<>();
        mylist.addAll(list);
    }
}
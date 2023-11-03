package org.example.structureStudy;

import java.util.List;

public class MyArrayList<E> implements List<E> {
    int size;
    private E[] array;

    public MyArrayList() {
        array = (E[]) new Object[10];
        size = 0;
    }

    public boolean add(E element) {
        if (size >= array.length) {
            // 큰 배열을 만들고 요소들을 복사함
            E[] bigger = (E[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        array[size] = element;
        size++;
        return true;
    }
}

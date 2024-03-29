package org.example.structureStudy;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean flag = true;
        for (E element : c) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("인덱스의 크기가 리스트 사이즈 보다 크거나, 0보다 작습니다.");
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        E old = get(index);
        array[index] = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index >  size) {
            throw new IndexOutOfBoundsException();
        }
        add(element);
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
    }

    @Override
    public E remove(int index) {
        E element = get(index);
        for (int i = index; i < size - 1; i++ ) {
            array[i] = array[i + 1];
        }
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i<size; i++) {
            if (o == array[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}

package com.willing.chapter01_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by willingLin on 2016/8/8.
 * 1_3_14
 */
public class ResizingArrayQueueOfStrings<T> implements Iterable<T> {

    private T[] t;
    private int size;
    private int first;
    private int last;

    public T[] getT() {
        return t;
    }

    public void setT(T[] t) {
        this.t = t;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public ResizingArrayQueueOfStrings() {
        t = (T[]) new Object[2];
        size = 0;
        first = 0;
        last = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void resize(int num) {
        if (size <= num) {
            T[] temp = (T[]) new Object[num];
            for (int i = 0; i < size; i++) {
                temp[i] = t[(first + i) % t.length];
            }
            t = temp;
            first = 0;
            last = num;
        }
    }

    public void enqueue(T newT) {
        if (size == t.length) {
            resize(2 * t.length);
        }
        t[last++] = newT;
        if (last == t.length) {
            last = 0;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T oldT = t[first];
        t[first] = null;
        size--;
        if (first == t.length) {
            first = 0;
        }
        if (size > 0 && size == t.length / 4) {
            resize(t.length / 2);
        }
        return oldT;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty.");
        return t[first];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<T> {
        private int i = 0;

        public boolean hasNext() {
            return i < size;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T newT = t[(i + first) % t.length];
            i++;
            return newT;
        }
    }
}

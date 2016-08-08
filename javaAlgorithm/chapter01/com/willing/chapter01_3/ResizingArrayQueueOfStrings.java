package com.willing.chapter01_3;

import java.util.Iterator;

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
        t = (T[])new Object[2];
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
        if(size <= num) {
            T[] temp = (T[])new Object[num];
            for (int i = 0; i < n; i++) {
                temp[i] = t[(first + i) % t.length];
            }
            t = temp;
            first = 0;
            last = num;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

package com.lab1.doublyLinkedList.build;

import com.lab1.doublyLinkedList.Comparator;

public interface Build<T> {
    String typeName();

    T create();

    Comparator<T> getTypeComparator();

    T createFromString(String s);

    String toString(T object);
}

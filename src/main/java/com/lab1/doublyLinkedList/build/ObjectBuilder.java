package com.lab1.doublyLinkedList.build;

import com.lab1.doublyLinkedList.Comparator;

public interface ObjectBuilder extends Build<Object> {
    String typeName();

    Object create();

    Comparator<Object> getTypeComparator();

    Object createFromString(String s);

    String toString(Object object);
}

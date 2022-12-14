package com.lab1.gui;

import com.lab1.doublyLinkedList.ObjectBuilderFactory;
import com.lab1.doublyLinkedList.build.ObjectBuilder;

import javax.swing.*;

public abstract class AbstractListActionListener implements ListActionListener {
    protected final String filename = "listData.dat";

    protected final DefaultListModel<Object> listModel = new DefaultListModel<>();
    protected ObjectBuilder builder;

    @Override
    public DefaultListModel<Object> getListModel() {
        return listModel;
    }

    @Override
    public void onSelectType(String type) {
        try {
            builder = ObjectBuilderFactory.getBuilderByName(type);
        } catch (Exception ignored) {

        }
    }
}

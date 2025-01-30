package com.ahmed.bajadda.component;

import com.ahmed.bajadda.composite.Folder;

public abstract class Component {
    private String name;
    private int level = 0;
    private int size = 0;

    public Component(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (this instanceof Folder) {
            this.size = 0;
        }
        this.size = size;
    }

    public abstract void show();

    public abstract int calculateSize();

    public String tab() {
        String tab = "";
        for (int i = 0; i < this.level; i++) {
            tab += "\t";
        }
        return tab;
    }

}

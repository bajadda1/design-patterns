package com.ahmed.bajadda.composite;

import com.ahmed.bajadda.component.Component;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addComponent(Component component) {
        component.setLevel(this.getLevel() + 1);
        this.children.add(component);
    }

    public void removeComponent(Component component) {
        this.children.remove(component);
    }


    @Override
    public void show() {
        System.out.println(tab() + "Folder :" + this.getName());
        for (Component c : this.children) {

            c.show();
        }
    }

    @Override
    public int calculateSize() {
        int size = 0;
        for (Component c : this.children) {

            size += c.getSize();
            System.out.println("size is :" + c.getSize());


        }
        return size;
    }


}

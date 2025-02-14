package com.ahmed.bajadda.composite;

import com.ahmed.bajadda.component.Component;

public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(tab() + "File :" + this.getName());
    }

    @Override
    public int calculateSize() {
        return this.getSize();
    }
}

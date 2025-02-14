package com.ahmed.bajadda.templatemethod;

public abstract class TemplateMethod {
    protected abstract void stepOne();
    protected abstract void stepTwo();

    public void templateMethod(){
        System.out.println("1=> This is first step in a template method algorithm to extract data");
        this.stepOne();
        System.out.println("3=> After that we will move to the second step in a template method algorithm to extract data");
        this.stepTwo();
        System.out.println("3=> Now  we will terminate with the last step in a template method algorithm to extract data");


    };
}

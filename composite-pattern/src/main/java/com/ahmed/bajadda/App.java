package com.ahmed.bajadda;

import com.ahmed.bajadda.component.Component;
import com.ahmed.bajadda.composite.File;
import com.ahmed.bajadda.composite.Folder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Folder root = new Folder("Design_Patterns");
        Folder behavioral = new Folder("Behavioral_Patterns");


        Folder structural = new Folder("Structural_Patterns");


        Folder creation = new Folder("Creation_Patterns");

        //Add folder to root folder
        root.addComponent(behavioral);
        root.addComponent(structural);
        root.addComponent(creation);

        //Add sub folder to destination folder
        File observer = new File("Observer");
        observer.setSize(100);
        behavioral.addComponent(observer);

        File strategy = new File("Strategy");
        strategy.setSize(50);
        behavioral.addComponent(strategy);
        behavioral.setSize(behavioral.calculateSize());

        File composite = new File("Composite");
        composite.setSize(150);
        structural.addComponent(composite);

        File decorator = new File("Decorator");
        decorator.setSize(150);
        structural.addComponent(decorator);
        structural.setSize(structural.calculateSize());

        File singleton = new File("Singleton");
        singleton.setSize(10);
        creation.addComponent(singleton);

        File builder = new File("Builder");
        builder.setSize(30);
        creation.addComponent(builder);
        creation.setSize(creation.calculateSize());



        root.show();
        System.out.println("Total size is :" + root.calculateSize() + " mo");
    }
}

package com.ahmed.bajadda;

import com.ahmed.bajadda.templatemethod.TemplateMethod;
import com.ahmed.bajadda.templatemethod.impl.TemplateMethodCSVImpl;
import com.ahmed.bajadda.templatemethod.impl.TemplateMethodExcelImpl;
import com.ahmed.bajadda.templatemethod.impl.TemplateMethodTxtImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("========TXT FILE========");
        TemplateMethod templateMethod = new TemplateMethodTxtImpl();
        templateMethod.templateMethod();

        System.out.println("========EXCEL FILE========");
        TemplateMethod templateMethod2 = new TemplateMethodExcelImpl();
        templateMethod2.templateMethod();

        System.out.println("========CSV FILE========");
        TemplateMethod templateMethod3 = new TemplateMethodCSVImpl();
        templateMethod3.templateMethod();

    }
}

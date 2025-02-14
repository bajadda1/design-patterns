package com.ahmed.bajadda.templatemethod.impl;

import com.ahmed.bajadda.templatemethod.TemplateMethod;

public class TemplateMethodExcelImpl extends TemplateMethod {
    @Override
    protected void stepOne() {
        System.out.println("2=> first process to extract data from an excel file");
    }

    @Override
    protected void stepTwo() {

        System.out.println("4=> second process to extract data from an excel file");
    }
}

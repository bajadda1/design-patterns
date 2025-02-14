package com.ahmed.bajadda.templatemethod.impl;

import com.ahmed.bajadda.templatemethod.TemplateMethod;

public class TemplateMethodCSVImpl extends TemplateMethod {
    @Override
    protected void stepOne() {
        System.out.println("2=> first process to extract data from a csv file");
    }

    @Override
    protected void stepTwo() {

        System.out.println("4=> second process to extract data from a csv file");
    }
}

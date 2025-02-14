package com.ahmed.bajadda.standard.impl;

import com.ahmed.bajadda.standard.Standard;

public class StandardImpl implements Standard {
    @Override
    public void operation(double a, double b) {
        System.out.println("The product is a*b :" + a * b);
    }
}

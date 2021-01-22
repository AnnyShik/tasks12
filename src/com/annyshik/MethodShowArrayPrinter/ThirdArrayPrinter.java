package com.annyshik.MethodShowArrayPrinter;

import com.annyshik.ArrayPrinter;

public class ThirdArrayPrinter extends ArrayPrinter {
    @Override
    protected void printElem(int elem) {
        System.out.println("(" + elem + ")");
    }
}
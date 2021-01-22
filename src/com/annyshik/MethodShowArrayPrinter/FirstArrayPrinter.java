package com.annyshik.MethodShowArrayPrinter;
import com.annyshik.ArrayPrinter;

public class FirstArrayPrinter extends ArrayPrinter {

    @Override
    protected void printElem(int elem) {
        System.out.println("[ " + elem + " ]");
    }
}

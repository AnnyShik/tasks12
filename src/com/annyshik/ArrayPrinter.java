package com.annyshik;
import com.annyshik.Array.Array;

public class ArrayPrinter {
    public void print(Array array) {
        for (int i = 0; i < array.getSize(); i++) {
            printElem((array.getElem(i)));
        }
    }

    /*** класс для определения наследников*/
    protected void printElem(int elem) {
    }

}

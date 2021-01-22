package com.annyshik;

import com.annyshik.Array.Array;
import com.annyshik.MethodShowArrayPrinter.FirstArrayPrinter;
import com.annyshik.MethodShowArrayPrinter.SecondArrayPrinter;
import com.annyshik.MethodShowArrayPrinter.ThirdArrayPrinter;
import com.annyshik.UI.MenuUI;

public class Main {

    public static void main(String[] args) {

        MenuUI menuUI;

        int resp = MenuUI.menu();
        ArrayPrinter arrayPrinter = null;

        Array array = new Array(0);
        int arr[] = array.initializeRandomMassive();
      //  arrayPrinter.print(array);

        if (resp == 1) arrayPrinter = new FirstArrayPrinter();
        else if (resp == 2) arrayPrinter = new SecondArrayPrinter();
        else if (resp == 3) arrayPrinter = new ThirdArrayPrinter();

        int arrayContains = array.showArray();

        arrayPrinter.print(array);
    }
}

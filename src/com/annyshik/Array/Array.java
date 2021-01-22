package com.annyshik.Array;
import java.util.Random;
public class Array {

    private int elem;
    private static int size;

    public Array(int elem) {
        this.elem = elem;
        this.size = size;
    }

    public int getElem(int i) {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int showArray() {
        int[] array = initializeRandomMassive();
        System.out.println(array + "showArray");

        return 0;
    }


    public static int[] initializeRandomMassive() {
        /***Заполнение массива случайными числами*/
        int[] arrayRandomPrinter = new int[0];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayRandomPrinter[i] = random.nextInt(10); //в скобках указать максимальное значение ячейки
            System.out.print(arrayRandomPrinter[i] + " ");
        }
        return arrayRandomPrinter;
    }
}

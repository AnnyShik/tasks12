package com.annyshik.UI;
import java.util.Scanner;

public class MenuUI {

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number for show : ");
        System.out.println("1. [ array ] ");
        System.out.println("2. { array } ");
        System.out.println("3. ( array ) ");
        System.out.println("4. exit");
        System.out.println("");
        System.out.print("You're response: ");
        int resp = sc.nextInt();
        sc.nextLine();
        System.out.println();
        return resp;
    }

}

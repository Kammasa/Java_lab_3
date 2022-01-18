import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        System.out.println("Wypisujemy wartości obudwu konstruktorów, pX i pX, pY, pZ");
        Punkt punktA = new Punkt(7);
        System.out.println(punktA);

        Punkt punktB = new Punkt(1, 2, 3);
        System.out.println(punktB);
        System.out.println("");

        System.out.println("Nadpisujemy wartości setterami:");
        punktA.setpX(9);
        punktA.setpY(7);
        punktA.setpZ(8);
        System.out.println(punktA);

        System.out.println("");
        System.out.println("Wartości punktu A:");
        System.out.println("X punktu A: " + punktA.getpX());
        System.out.println("Y punktu A: " + punktA.getpY());
        System.out.println("Z punktu A: " + punktA.getpZ());
        System.out.println("");
        System.out.println("Wartości punktu B:");
        System.out.println("X punktu B: " + punktB.getpX());
        System.out.println("Y punktu B: " + punktB.getpY());
        System.out.println("Z punktu B: " + punktB.getpZ());
        System.out.println("");
        System.out.println("Suma wartości punktu B:");
        System.out.println(punktB.suma());
        System.out.println("Różnica wartości punktu B:");
        System.out.println(punktB.roznica());
        System.out.println("Różnica A:");
        System.out.println(punktA.roznica(punktB.getpX(), punktB.getpY(), punktB.getpZ()));
        System.out.println("Różnica B:");
        System.out.println(punktB.roznica(punktB.getpX(), punktB.getpY(), punktB.getpZ()));


    }
}

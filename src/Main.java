import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student[] studenci = new Student[3];
        Student student = new Student ("Jan","Nowak",76897,false);
        studenci[0] = student;
        student = new Student ("Jan", "Kowalski", 54689, true);
        studenci[1] = student;
        student = new Student ("Edward","Ącki",11990,true);
        studenci[2] = student;

        for (Student wypiszStudentów : studenci){
            student.wypisanieDanych();
            System.out.println("");
        }
    }
}

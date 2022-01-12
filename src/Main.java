import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1


        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i > 0) {
            ++i;
            System.out.println("Podaj dowolną liczbę całkowitą w zakresie od 1 do 6: ");
            System.out.println("Uwaga! Podanie 0 lub liczby >6 od razu kończy działanie programu");
            switch (scanner.nextInt()) {
                case 1 -> System.out.println(LiczbyEnum.jeden);
                case 2 -> System.out.println(LiczbyEnum.dwa);
                case 3 -> System.out.println(LiczbyEnum.trzy);
                case 4 -> System.out.println(LiczbyEnum.cztery);
                case 5 -> System.out.println(LiczbyEnum.pięć);
                case 6 -> System.out.println(LiczbyEnum.sześć);
                default -> {
                    System.out.println(StatusEnum.koniec);
                    return;
                }
            }
            if (i == 0) {
                System.out.println(StatusEnum.koniec);
            } else {
                System.out.println(StatusEnum.kontynuujemy);
            }
        }
    }
}

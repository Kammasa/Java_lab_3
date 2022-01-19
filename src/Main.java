import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
Pojazd pojazd = new Pojazd("Merceds","GLA",2008,37500.00);
        System.out.println(pojazd.toString());
        System.out.println("Wartość pojazdu: " + pojazd.wyliczWartość() + " złotych");

Samochód samochód = new Samochód("Fiat", "500",2010,56800.00,3,"Miętowy");
        System.out.println(samochód.toString());
        System.out.println("Wartość samochodu wynosi: " + samochód.wyliczWartość() + " złotych");

Ciężarówka ciężarówka = new Ciężarówka("Mercedes", "Actros",2011, 154900.00, 2 , "Czarny", "Budowlany", 4);
        System.out.println(ciężarówka.toString());
        System.out.println("Wartość ciężarówki wynosi " + ciężarówka.wyliczWartość() + " złotych");

        List<Pojazd> listaPojazdów = new ArrayList<>();
        listaPojazdów.add(pojazd);
        listaPojazdów.add(samochód);
        listaPojazdów.add(ciężarówka);
        System.out.println(listaPojazdów);
    }
}

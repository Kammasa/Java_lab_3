import org.w3c.dom.ls.LSOutput;

public class Student {
    /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

    private Osoba osoba;
    private wydzialEnum wydzial;

    public Student(Osoba osoba, wydzialEnum wydzial){

        this.osoba = osoba;
        this.wydzial = wydzial;

    }

        public Osoba getOsoba () {
            return osoba;
        }

        public void setOsoba (Osoba osoba){
            this.osoba = osoba;
        }

        public wydzialEnum getWydzial () {
            return wydzial;
        }

        public void setWydzial (wydzialEnum wydzial){
            this.wydzial = wydzial;
        }

    public String toString() {
        return osoba + " " + "Wydział: " + wydzial;
    }
}


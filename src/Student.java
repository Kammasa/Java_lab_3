public class Student {
    public String imię;
    public String nazwisko;
    public int numerAlbumu;
    public boolean statusStudenta;

    public Student (String imię, String nazwisko, int numerAlbumu, boolean statusStudenta) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
        this.statusStudenta = statusStudenta;
    }

    public void wypisanieDanych() {
        System.out.println("Imię: " + this.imię);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Numer Albumu: " + this.numerAlbumu);
        if (true == statusStudenta) {
            System.out.println("Status Studenta: Aktywny");
        } else {
            System.out.println("Status Studenta: Nieaktywny");
        }
    }
}

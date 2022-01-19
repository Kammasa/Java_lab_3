public class Samochód extends Pojazd {

    protected int ilośćDrzwi;
    protected String kolor;

    public Samochód(){

        super();
        this.ilośćDrzwi = 0;
        this.kolor = "";
    }
    public Samochód (int ilośćDrzwi, String kolor){

        this.ilośćDrzwi = ilośćDrzwi;
        this.kolor = kolor;
    }
    public Samochód (String marka, String model, int rokProdukcji, double wartość, int ilośćDrzwi, String kolor){

        super(marka, model, rokProdukcji, wartość);
        this.ilośćDrzwi = ilośćDrzwi;
        this.kolor = kolor;
}

    @Override
    protected double wyliczWartość() {
        return super.wyliczWartość();
    }

    @Override
    public String toString() {
        return "Samochód{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", wartość=" + wartość +
                ", ilośćDrzwi=" + ilośćDrzwi +
                ", kolor='" + kolor + '\'' +
                '}';
    }


}


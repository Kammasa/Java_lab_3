import java.rmi.ConnectIOException;

public class Ciężarówka extends Samochód {

    protected String przeznaczenie;
    protected int ilośćOsi;

    public Ciężarówka() {

        super();
        this.przeznaczenie = "";
        this.ilośćOsi = 0;
    }
    public Ciężarówka(String przeznaczenie, int ilośćOsi){

        this.przeznaczenie = przeznaczenie;
        this.ilośćOsi = ilośćOsi;
    }

public Ciężarówka (int ilośćDrzwi,String kolor, String przeznaczenie, int ilośćOsi ){

        super(ilośćDrzwi, kolor);
        this.przeznaczenie = przeznaczenie;
        this.ilośćOsi = ilośćOsi;
}

public Ciężarówka (String marka, String model, int rokProdukcji, double wartość, int ilośćDrzwi, String kolor, String przeznaczenie, int ilośćOsi){

        super (marka, model, rokProdukcji, wartość, ilośćDrzwi, kolor);
        this.przeznaczenie = przeznaczenie;
        this.ilośćOsi = ilośćOsi;
}

    @Override
    protected double wyliczWartość() {
        return super.wyliczWartość();
    }

    @Override
    public String toString() {
        return "Ciężarówka{" + "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", wartość=" + wartość +
                ", ilośćDrzwi=" + ilośćDrzwi +
                ", kolor='" + kolor + '\'' +
                ", przeznaczenie='" + przeznaczenie + '\'' +
                ", ilośćOsi=" + ilośćOsi +
                '}';
    }
}


public class Pojazd {
    protected String marka;
    protected String model;
    protected int rokProdukcji;
    protected String przeznaczenie;
    protected double wartość;

public Pojazd() {
    this.marka = "";
    this.model = "";
    this.rokProdukcji = 0;
    this.przeznaczenie = "";
    this.wartość = 0;
}

public Pojazd (String marka, String model, int rokProdukcji, String przeznaczenie, double wartość){

    this.marka = marka;
    this.model = model;
    this.rokProdukcji = rokProdukcji;
    this.przeznaczenie = przeznaczenie;
    this.wartość = wartość;
}

protected double wyliczWartość(){
    return this.wartość;
}

    @Override
    public String toString() {
        return "Pojazd{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", przeznaczenie='" + przeznaczenie + '\'' +
                ", wartość=" + wartość +
                '}';
    }
}



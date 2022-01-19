public class Pojazd {
    protected String marka;
    protected String model;
    protected int rokProdukcji;
    protected double wartość;

public Pojazd() {
    this.marka = "";
    this.model = "";
    this.rokProdukcji = 0;
    this.wartość = 0;
}

public Pojazd (String marka, String model, int rokProdukcji, double wartość){

    this.marka = marka;
    this.model = model;
    this.rokProdukcji = rokProdukcji;
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
                ", wartość=" + wartość +
                '}';
    }
}



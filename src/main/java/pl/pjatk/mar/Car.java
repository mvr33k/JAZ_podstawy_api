package pl.pjatk.mar;

public class Car {

    public Car(String marka, int rok) {
        this.marka=marka;
        this.rok=rok;
    }
    private String marka;
    private int rok;

    public String getMarka() {
        return marka;
    }

    public int getRok() {
        return rok;
    }
}

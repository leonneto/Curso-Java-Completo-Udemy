public abstract class TaxPlayer {
    private String name;
    private double anualCome;

    public TaxPlayer(String name, double anualCome) {
        this.name = name;
        this.anualCome = anualCome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualCome() {
        return anualCome;
    }

    public void setAnualCome(double anualCome) {
        this.anualCome = anualCome;
    }

    public abstract double tax();

}

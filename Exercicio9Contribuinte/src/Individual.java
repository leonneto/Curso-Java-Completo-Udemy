public class Individual extends TaxPlayer{
    private double healthExpenditures;

    public Individual(String name, double anualCome, double healthExpenditures){
        super(name, anualCome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualCome() <  20000.00){
            return getAnualCome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getAnualCome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}

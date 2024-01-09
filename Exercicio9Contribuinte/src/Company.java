public class Company extends TaxPlayer{
    private int numEmployee;

    public Company(String name, double anualCome, int numEmployee){
        super(name, anualCome);
        this.numEmployee = numEmployee;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    @Override
    public double tax() {
        if(numEmployee > 10){
            return getAnualCome() * 0.14;
        }
        else {
            return getAnualCome() * 0.16;
        }
    }
}

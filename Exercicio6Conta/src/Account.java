public class Account {
    private int number;
    private String holder;
    private Double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;


    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialDeposit;

    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount + 5.0;

    }

    @Override
    public String toString() {
        return "Number: "+
                number
                +" Holder: "
                +holder
                +" Balance: R$"+
                String.format("%.2f",balance);
    }
}

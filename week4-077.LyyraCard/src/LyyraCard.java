public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.50) {
            balance -=2.50;
        }
    }

    public void payGourmet() {
        if (balance >= 4) {
            balance -=4;
        }
    }

    public void loadMoney(double amount) {

        if (amount >= 0) {
            balance += amount;
            if (balance > 150.00) {
                balance = 150.00;
            }
        }
    }
}

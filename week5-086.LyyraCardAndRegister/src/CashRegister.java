
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        cashInRegister = 1000;
    }

    public void loadMoneyToCard(LyyraCard card, double sum){

        if(sum > 0){
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double economicalLunch = 2.50;

        if (card.balance() >= economicalLunch) {
            economicalSold++;
            card.pay(economicalLunch);
            return true;
        } else {
            return false;
        }

    }

    public double payEconomical(double cashGiven) {
        double economicalLunch = 2.50;

        if (cashGiven >= economicalLunch) {
            cashInRegister += economicalLunch;
            economicalSold++;
            return cashGiven - economicalLunch;
        } else {
            return cashGiven;
        }

    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetLunch = 4;

        if(card.balance() >= gourmetLunch){
            gourmetSold++;
            card.pay(gourmetLunch);
            return true;
        } else {
            return false;
        }
    }

    public double payGourmet(double cashGiven) {
        double gourmetLunch = 4;

        if(cashGiven >= gourmetLunch){

            cashInRegister += gourmetLunch;
            gourmetSold++;
            return cashGiven - gourmetLunch;
        } else {
            return cashGiven;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

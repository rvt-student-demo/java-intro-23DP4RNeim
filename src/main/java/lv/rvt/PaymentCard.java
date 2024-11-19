package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void eatHeartily() {
        this.balance -= 5.6;
    }

    public void eatAffordably() {
        this.balance -= 2.3;
    }

    public void topUp(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }
}


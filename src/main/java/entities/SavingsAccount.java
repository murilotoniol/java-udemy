package entities;

public class SavingsAccount extends Accountcap13 {
    private Double interestRating;

    public SavingsAccount(){
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRating) {
        super(number, holder, balance);
        this.interestRating = interestRating;
    }

    public Double getInterestRating() {
        return interestRating;
    }

    public void setInterestRating(Double interestRating) {
        this.interestRating = interestRating;
    }

    public void updateBalance(){
        balance += balance * interestRating;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
}

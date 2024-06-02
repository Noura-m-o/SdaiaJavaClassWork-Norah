package session3;

public class BankAccount {

    String name;
    private double balance;
    double annualtRate = 0.04;


    public BankAccount (String name, double balance){
        this.name = name;
        this.balance = balance;


    }

    public double getMonthlyRate(double annualtRate){


        double amt = annualtRate/12;
        return amt;

    }

    public double getMonthlyInt (double amt){

        double Aint = amt*balance;
        return Aint;

    }
}

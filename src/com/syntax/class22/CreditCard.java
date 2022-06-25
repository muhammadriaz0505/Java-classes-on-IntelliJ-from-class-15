package com.syntax.class22;

public class CreditCard {
    double balance;
    double interest;
    void getInterest(double balance,double interest){
        System.out.println("Interest is "+balance*(interest/100));
    }
}
class Visa extends CreditCard {

}
class AX extends CreditCard {
    public static void main(String[] args) {
        CreditCard hwCreditCard=new CreditCard();
        hwCreditCard.getInterest(5000,5);
        Visa visa=new Visa();
        visa.getInterest(2000,7);
        AX ax=new AX();
        ax.getInterest(10000,10);
    }

}
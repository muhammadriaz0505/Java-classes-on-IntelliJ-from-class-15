package com.syntax.class22;

public class CreditCardHW {
    double balance;
    double interest;
   double getInterest(double balance){
       this.balance=balance;
       return interest=balance*0.3;
   }
}
class VisaHW extends CreditCardHW {
    double getInterest(double balance) {
        return interest= balance*0.5;
    }
}
class AXHW extends CreditCardHW {
    double getInterst(double balance){
        return interest=balance*.05;
    }
    public static void main(String[] args) {
        CreditCardHW creditCard=new CreditCardHW();
        System.out.println(creditCard.getInterest(1000));
        VisaHW visaHw=new VisaHW();
        System.out.println(visaHw.getInterest(1500));
        AXHW axHw=new AXHW();
        System.out.println(axHw.getInterst(5000));
    }
}


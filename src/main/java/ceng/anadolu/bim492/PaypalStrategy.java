package ceng.anadolu.bim492;

import ceng.anadolu.bim492.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(double amount) {
        System.out.format("double : %.2f paid using Paypal", amount);
    }
}

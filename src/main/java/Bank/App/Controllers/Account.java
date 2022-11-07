package Bank.App.Controllers;

import Bank.App.Interfaces.IRate;

public abstract class Account implements IRate {
    // List of all common properties for savings and checking accounts

    String name;
    String sSn;
    double balance;
    static int index = 10000;
    String accNumber;
    double rate;

    // Constructor to set base properties and initialize account
    public Account (String name, String sSN, double initDeposit){
        this.name = name;
        this.sSn = sSN;
        this.balance = initDeposit;
        System.out.println("Name: " + name + " sSN: " + sSN + " Balance: " + balance);

        // set accountNumber
        index++;
        this.accNumber = setAccountNumber();

    }

    private String setAccountNumber(){
        String lastTwoOfsSN = sSn.substring(sSn.length()-2, sSn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfsSN + uniqueID + randomNumber;
    }
}

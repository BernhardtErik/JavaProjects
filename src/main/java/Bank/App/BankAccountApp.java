package Bank.App;

import Bank.App.Controllers.Checking;
import Bank.App.Controllers.Savings;

public class BankAccountApp {
    public static void main(String[] args) {

        Checking checkAcc1  = new Checking("John Doe", "663223647", 1500);
        Savings savAcc1   = new Savings("Erik Bernhardt", "746284629", 2500);


        // Read a csv file and then create new accounts based on the date

    }
}

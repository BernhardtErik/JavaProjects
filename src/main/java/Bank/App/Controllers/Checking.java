package Bank.App.Controllers;

public class Checking extends Account{
    // List properties specific to check account

    int debitCardNumber;
    int pinNumber;

    // Constructor to initialize settings for the check properties


    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "2" + accNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        System.out.println("Imeplement rate for checking");
    }
    // List any methods specific to check accounts

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        pinNumber = (int)(Math.random()*Math.pow(10,4));
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Checking account features: " +
                "\nCard number: " + debitCardNumber +
                "\nPin: " + pinNumber
                 );
    }
}

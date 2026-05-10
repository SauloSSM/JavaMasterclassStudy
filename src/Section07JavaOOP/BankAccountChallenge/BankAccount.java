package Section07JavaOOP.BankAccountChallenge;

public class BankAccount {
    public static void main(String[] args) {

//        Account leticiaAccount = new Account("12345", 2000.00, "Leticia Braghim",
//                "leticiabraghim@gmail.com", "(16)99309-4331");

        Account leticiaAccount = new Account();

        System.out.println(leticiaAccount.getAccountNumber());
        System.out.println(leticiaAccount.getBalance());

        leticiaAccount.depositFunds(400);
        leticiaAccount.withdrawFunds(200);

        Account sauloAccount = new Account("Saulo",
                "saulostuque3@gmail.com", "(16)98809-0402");
        System.out.println("AccountNumber: " + sauloAccount.getAccountNumber() +
                "; Name " + sauloAccount.getCustomerName());

    }
}

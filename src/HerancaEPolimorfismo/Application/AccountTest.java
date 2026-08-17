package HerancaEPolimorfismo.Application;

import HerancaEPolimorfismo.Entities.Account;
import HerancaEPolimorfismo.Entities.BusinessAccount;
import HerancaEPolimorfismo.Entities.SavingsAccount;

public class AccountTest {
    static void main(String[] args) {

        Account account1 = new Account(1000, "Alex", 0.0);
        BusinessAccount businessAccount1 = new BusinessAccount(1001, "Maria", 0.0, 500.0);

        // UPCASTING

        Account account2 = businessAccount1;
        Account account3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account account4 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount account5 = (BusinessAccount) account3;
        account5.loan(100.0);

        if(account4 instanceof BusinessAccount) {
            BusinessAccount account6 = (BusinessAccount) account4;
            account6.loan(200.0);
            System.out.println("Loan!");
        }

        if(account4 instanceof SavingsAccount) {
            SavingsAccount account6 = (SavingsAccount) account4;
            account6.updateBalance();
            System.out.println("Update!");
        }
    }
}

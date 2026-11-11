package Practice;

public class Second {
    static class BankAccount{
        int accountNumber;
        String accountHolder;
        float balance;

        void deposit(float amount){
            this.balance = this.balance+ amount;
        }
        void withdrawal(float amount){
            if(amount <= this.balance){
                this.balance = this.balance - amount;
            }
        }

        void displayBalance(){
            System.out.println(this.balance);
        }
    }
}

public class BankAccountTest {
        public static void main(String[] args) {
                BankAccount account1 = new BankAccount("Иван Иванов");
                BankAccount account2 = new BankAccount("Петр Петров");

                System.out.println("Пополнение 1000: " + account1.deposit(1000));
                System.out.println("Баланс account1: " + account1.getBalance());

                System.out.println("Снятие 500: " + account1.withdraw(500));
                System.out.println("Баланс account1: " + account1.getBalance());

                System.out.println("Снятие 600: " + account1.withdraw(600));
                System.out.println("Баланс account1: " + account1.getBalance());

                System.out.println("Перевод 300 на account2: " +
                                account1.transfer(account2, 300));
                System.out.println("Баланс account1: " + account1.getBalance());
                System.out.println("Баланс account2: " + account2.getBalance());

                account1.setLocked(true);
                System.out.println("Пополнение 100 (заблокирован): " +
                                account1.deposit(100));
                System.out.println("Перевод 100 (заблокирован): " +
                                account1.transfer(account2, 100));
        }
}
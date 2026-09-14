public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount("001-234567", "Diego Ocampo");

        System.out.println("Cuenta: " + savingsAccount.getAccountNumber() + ", titular: " + savingsAccount.getAccountHolder() + ", saldo: " + savingsAccount.getBalance());

        boolean validDeposit = savingsAccount.deposit(500000.0);
        System.out.println("Depósito de 500000: " + (validDeposit ? "aceptado" : "rechazado") + ". Saldo: " + savingsAccount.getBalance());

        boolean invalidDeposit = savingsAccount.deposit(-100.0);
        System.out.println("Depósito de -100: " + (invalidDeposit ? "aceptado" : "rechazado") + ". Saldo: " + savingsAccount.getBalance());

        boolean validWithdraw = savingsAccount.withdraw(200000.0);
        System.out.println("Retiro de 200000: " + (validWithdraw ? "aceptado" : "rechazado") + ". Saldo: " + savingsAccount.getBalance());

        boolean excessiveWithdraw = savingsAccount.withdraw(1000000.0);
        System.out.println("Retiro de 1000000 (mayor al saldo): " + (excessiveWithdraw ? "aceptado" : "rechazado") + ". Saldo: " + savingsAccount.getBalance());

        boolean invalidWithdraw = savingsAccount.withdraw(-50.0);
        System.out.println("Retiro de -50: " + (invalidWithdraw ? "aceptado" : "rechazado") + ". Saldo: " + savingsAccount.getBalance());
    }
}
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else {
            balance -= amount;
        }
    }

    /**
     * chuyen.
     *
     */

    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT) == false
                && operation.equals(Transaction.WITHDRAW) == false) {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation.equals(Transaction.DEPOSIT)) {
                deposit(amount);
                if (amount >= 0) {
                    transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
                }
            }
            if (operation.equals(Transaction.WITHDRAW)) {
                withdraw(amount);
                if (amount <= balance && amount > 0) {
                    transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
                }
            }
        }
    }

    /**
     * chuyen.
     *
     */

    public void printTransaction() {
        String s = "";
        String temp = "";

        for (int i = 0; i < transitionList.size(); i++) {
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
                temp = "Nap tien $";
            } else {
                temp = "Rut tien $";
            }
            String s1 = String.format("%.2f", transitionList.get(i).getAmount());
            String s2 = String.format("%.2f", transitionList.get(i).getBalance());
            s += "Giao dich " + (i + 1) + ": " + temp + s1 + ". So du luc nay: $" + s2 + ".\n";
        }
        System.out.println(s);
    }
}

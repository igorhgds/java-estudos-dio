package codigosBasicos;

public class ifElse {

    public static void main(String[] args) {
        double balance = 25.0;
        double requestedValue = 27.0;

        if (requestedValue < balance) {
            balance -= requestedValue;
            System.out.println("Actual Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

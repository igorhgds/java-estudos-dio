package codigosBasicos;

public class IfElse {

    public static void main(String[] args) {
        double balance = 25.0;
        double requestedValue = 27.0;

        if (requestedValue < balance) {
            balance -= requestedValue;
            System.out.println("Saldo Atual: " + balance);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
}

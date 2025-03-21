package codigosBasicos;

public class IfElseTwo {
    public static void main(String[] args) {
        int yearOfRelease = 2022;
        boolean includedThePlan = false;
        double movieNote = 8.1;
        String planType = "Plus";

        if (yearOfRelease >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme Retrô");
        }

        if (includedThePlan == true && planType.equals("Plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        if (movieNote > 8 ){
            System.out.println("Ótimo filme para assistir agora");
        } else {
            System.out.println("Deixe para assistir mais tarde");
        }
    }
}

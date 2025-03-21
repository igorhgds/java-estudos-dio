package codigosBasicos;

public class SwitchCase {
    public static void main(String[] args) {
        String character = "M";
        String characterTwo = "P";

        switch (character) {
            case "P": {
                System.out.println("PEQUENO");
                break;

            }case "M":{
                System.out.println("MEDIO");
                break;

            } case "G":{
                System.out.println("GRANDE");
                break;

            } default:
                System.out.println("INDEFINIDO");
        }

        // Switch Expressions
        switch (characterTwo) {
            case "P" -> System.out.println("PEQUENO");
            case "M" -> System.out.println("MEDIO");
            case "G" -> System.out.println("GRANDE");
            default -> System.out.println("INDEFINIDO");
        }
    }
}

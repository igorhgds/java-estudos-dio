package codigosBasicos;

public class elseIf {
    public static void main(String[] args) {
        int grade = 6;

        if (grade >= 7) {
            System.out.println("Aprovado");
        } else if (grade >= 5 && grade < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        //Operador Ternário
        String result = grade >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(result);

        String result2 = grade >= 7 ? "Aprovado" : grade >=5 && grade < 7 ? "Recuperação" : "Reprovado";
        System.out.println(result2);
    }
}

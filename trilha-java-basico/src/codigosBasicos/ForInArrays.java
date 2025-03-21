package codigosBasicos;

public class ForInArrays {
    public static void main(String[] args) {
        String students[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String student : students){
            System.out.println("Nome do aluno: " + student);
        }
    }
}

package codigosBasicos;

import java.util.Scanner;

public class ForInArraysTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] students = {"Camila", "Lucas", "Bruna", "Pedro"};

        double avarage = calculateClassAverage(students, scan);
        System.out.println("Média da turma: " + avarage);
    }

    private static double calculateClassAverage(String[] students, Scanner scan) {
        double sum = 0;
        for (String student : students) {
            System.out.printf("Nota do aluno %s: ", student);
            double grade = scan.nextDouble();
            sum += grade;
        }
        return sum/students.length;
    }
}

package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio3.src.main.java;

import java.util.Locale;
import java.util.Scanner;

import IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio3.src.main.java.entities.Student;

public class Start {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        student.setName(scan.nextLine());

        for(int i = 1; i <= 3; i++) {
            student.setGrade(scan.nextDouble(), i);
        }

        scan.close();

        System.out.println();
        System.out.println(student);
    }
}

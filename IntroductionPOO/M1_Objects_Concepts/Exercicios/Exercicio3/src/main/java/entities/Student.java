package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio3.src.main.java.entities;

public class Student {

    private String name;
    private double[] grades = new double[3];
    private double finalGrade;

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(double grade, int trimester){
        if (trimester == 1) {
            if(grade <= 30){
                this.grades[trimester-1] = grade;
            }
        }
        else{
          if(grade <= 35){
                this.grades[trimester-1] = grade;
            }  
        }
    }

    public void calculateFinalGrade(){
        for (double d : grades) {
            this.finalGrade += d;
        }
    }

    public String verifyPassed(){
        double missingPoints;
        
        if(this.finalGrade >= 60){
            return "Pass";
        }
        else{
            missingPoints = 60 - this.finalGrade;
            return "Failed\nMissing " + String.format("%.2f", missingPoints) + " Points".toUpperCase();
        }
    }

    @Override
    public String toString(){
        calculateFinalGrade();
        return ("Final Grade = " + String.format("%.2f", finalGrade)+ "\n"
                + verifyPassed()).toUpperCase();
    }
}

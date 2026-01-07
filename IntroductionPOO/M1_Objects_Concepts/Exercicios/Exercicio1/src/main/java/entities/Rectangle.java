package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio1.src.main.java.entities;

public class Rectangle {
    private double width;
    private double heigth;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    private double calculateArea(){
        return heigth*width;
    }
    
    private double calculatePerimeter(){
        return (heigth*2) + (width*2);
    }

    private double calculateDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
    }

    @Override
    public String toString(){
        return "AREA = " +  String.format("%.2f", calculateArea())
            + "\nPERIMETER = " + String.format("%.2f", calculatePerimeter())
            + "\nDIAGONAL = " +  String.format("%.2f", calculateDiagonal());
    }
}

package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exemplos.Exemplo1.src.main.java.entities;

public class Triangle {
    
    public double a;
    public double b;
    public double c;

    public double calculateArea(){
        double perimeter = (a + b + c) / 2.0;
        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    
        return area;
    }
}

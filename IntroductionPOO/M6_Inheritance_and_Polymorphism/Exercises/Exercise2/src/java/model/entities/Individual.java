package M6_Inheritance_and_Polymorphism.Exercises.Exercise2.src.java.model.entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(){

    }

    public Individual(String name, double anualIncome, Double healthExpenditures) {
        super(name, anualIncome); //Refere-se ao construtor da superclasse (TaxPayer)
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;

        if (getAnualIncome() < 20000.00) {
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }

        basicTax -= (healthExpenditures * 0.5);

        if(basicTax < 0.0){
            basicTax = 0.0;
        }

        return basicTax;
    }
}

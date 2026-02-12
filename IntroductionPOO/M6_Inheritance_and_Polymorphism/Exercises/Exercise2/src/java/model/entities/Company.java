package M6_Inheritance_and_Polymorphism.Exercises.Exercise2.src.java.model.entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;

    public Company() {
    }

    public Company(String name, double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double basicTax;
        if (numberOfEmployees > 10) {
            basicTax = getAnualIncome() * 0.14;
        } else {
            basicTax = getAnualIncome() * 0.16;
        }
        return basicTax;
    }
}

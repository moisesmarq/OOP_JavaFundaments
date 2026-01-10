package M6_Inheritance_and_Polymorphism.Examples.Example1.src.main.java.model.entities;

public class OutSourcedEmployee extends Employee{
    private double additionalCharge;

    public OutSourcedEmployee() {
        super();
    }

    public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
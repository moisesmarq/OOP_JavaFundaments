package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exemplos.Exemplo2.src.main.java.entities;

public class Product {
    
    private String name;
    private double price;
    private int quantityInStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }



    public double TotalValueInStock(){
        return quantityInStock*price;
    }

    public void addProducts(int quantity){
        this.quantityInStock += quantity;
    }

    public void removeProduct(int quantity){
        this.quantityInStock -= quantity; 
    }

    @Override
    public String toString(){
        return String.format("Name: %s, $ %.2f, %d units, Total: $%.2f", name, price, quantityInStock, TotalValueInStock());
    }
}

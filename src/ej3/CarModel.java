
package ej3;


public class CarModel {
//atributos
    
    private Category category;
    private String modelNumber;
    private int price;
    
    //metodos

    public CarModel(Category category, String modelNumber, int price) {
        this.category = category;
        this.modelNumber = modelNumber;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getPrice() {
        return price;
    }
    
    
}

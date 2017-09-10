
package ej3;

public class Car {
    //atributos
    
    private CarModel model;
    private int traveled;
    //metodos

    public Car(CarModel model, int Traveled) {
        this.model = model;
        this.traveled = Traveled;
    }

    public CarModel getModel() {
        return model;
    }

    public int getTraveled() {
        return traveled;
    }
    public void setTraveled(int distance){
         this.traveled = distance;
    }
   
}

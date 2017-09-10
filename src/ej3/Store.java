
package ej3;

import java.util.ArrayList;

public class Store {
    //atributos
    
     private ArrayList<Car> cars = new ArrayList<Car>();
     private Address address;
     
     //metodos

    public Store(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    public  ArrayList<Car> getCarList(){
        return cars;
    }
    public void addCar(Car car){
        cars.add(car);
    }
    
}

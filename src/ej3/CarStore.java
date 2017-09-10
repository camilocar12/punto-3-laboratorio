
package ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class CarStore {
    
    private Store store;
    
    public void crearTienda(){
         Scanner entrada = new Scanner(System.in);
         
        Address address;              
        String country, house, postCode;
     
        System.out.print("Ingrese el Estado donde esta ubicada la tienda: ");
        country = entrada.nextLine();
        System.out.print("Ingrese la casa de la tienda: ");
        house = entrada.nextLine();
        System.out.print("Ingrese el codigo postal: ");
        postCode = entrada.nextLine();
        
        address = new Address(house, country, postCode);
        this.store = new Store(address);  
        
        
    }
    public void mostrarTienda(){
        Address address;  
        address=store.getAddress();
        System.out.println("Tienda 1 --> " + address.getCountry()+"/" + address.getHouse()+ "/"+ address.getPostcode());
       
    }
    public void registrarCarro(){
        Scanner entrada = new Scanner(System.in);
        Category category;
        Car car;
               
        String categoria, modelNumber;
        CarModel carModel;
        int price, travel;
        
        System.out.print("ingrese el tipo (categoria) de carro: ");
        categoria = entrada.nextLine();
        System.out.print("ingrese el modelo del carro: ");
        modelNumber = entrada.nextLine();
        System.out.print("ingrese el precio del carro: ");
        price = entrada.nextInt();
        System.out.print("ingrese la distancia recorrida del carro: ");
        travel = entrada.nextInt();
        
        
        category = new Category(categoria);      
        carModel = new CarModel(category,modelNumber, price);
        car = new Car(carModel, travel);
        store.addCar(car);
     
    }
    public void mostrarCarro(){
        
       ArrayList<Car> cars; 
       cars = store.getCarList(); 
        System.out.println("total de carros registrados: "+ cars.size());
        

        for (int i=0; i<cars.size();i++){
            System.out.println("Información del carro " + (i+1));
            System.out.println("La categoría del carro es: " + cars.get(i).getModel().getCategory().getName());
            System.out.println("El modelo del carro es: " + cars.get(i).getModel().getModelNumber());
            System.out.println("El precio del carro es: " + cars.get(i).getModel().getPrice());
            System.out.println("La distancia recorrida por el carro es: " + cars.get(i).getTraveled());
            System.out.println("");
            
        }                    
       
    }
           
    public static void main(String args[]){
         Scanner entrada = new Scanner(System.in);
         CarStore carStore = new CarStore();
         carStore.crearTienda();
         String opcion1;
         System.out.println("REGISTRO DE CARROS");
         carStore.registrarCarro();
         System.out.print("desea registrar otro carro (si o no):  ");
         opcion1 = entrada.nextLine();
         while (opcion1.equals("si")){
             carStore.registrarCarro();
             System.out.print("desea registrar otro carro (si o no):  ");
             opcion1 = entrada.nextLine();  
         }
         System.out.println("");
         carStore.mostrarTienda();
         System.out.println("INFORMACION DE CARRO");
         carStore.mostrarCarro();  
    } 
}

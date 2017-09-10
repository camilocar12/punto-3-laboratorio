
package ej3;

public class Address {
    //Atributos
    
    private String house;
    private String postcode;
    private String country;
    
    //Metodos

    public Address(String house, String county, String postcode) {
        this.house = house;
        this.country = county;
        this.postcode = postcode;
    }

    public String getHouse() {
        return house;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }
    
    
}

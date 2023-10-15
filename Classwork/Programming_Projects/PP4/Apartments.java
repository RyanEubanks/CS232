package PP4;

public class Apartments {
    
    // Declare variables
    private int apartmentNum;
    private int bedroomNum;
    private int bathroomNum;

    // Constructor
    public Apartments(int apartmentNum, int bedroomNum, int bathroomNum) {
        this.apartmentNum = apartmentNum;
        this.bedroomNum = bedroomNum;
        this.bathroomNum = bathroomNum;
    }

    // getters
    public int getApartmentNum() {
        return this.apartmentNum;
    }

    public int getBedroomNum() {
        return this.bedroomNum;
    }

    public int getBathroomNum() {
        return this.bathroomNum;
    }

    // to string method that prints apartment details
    @Override
    public String toString() {
        return "Apartment Number: " + this.apartmentNum + " has " 
        + this.bedroomNum + " bedrooms " + " and " + this.bathroomNum + " bathrooms.";
    }

}

import java.util.ArrayList;
import java.util.List;

public class Car extends Dimension {

    Producer producer;
    boolean isAutomaticGear;
    String segment;
    Dimension dimension;

    List<Country> countriesOfSale;


//    public void printCountriesOfSale() {
//        for (Country allCountry: countriesOfSale){
//            System.out.print(allCountry.getCountryName()+ " - " + allCountry.getCountrySign());
//            System.out.print(",");
//        }
//    }



    public Car(String name, String model, int high, int width, int trunkCapacity, boolean isAutomaticGear, String segment, List<Country> countriesOfSale) {
        super(name, model, high, width, trunkCapacity);
        this.isAutomaticGear = isAutomaticGear;
        this.segment = segment;
        this.countriesOfSale = countriesOfSale;
    }


    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public String getSegment() {
        return segment;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public List<Country> getCountriesOfSale() {
        return countriesOfSale;
    }

    public void setCountriesOfSale(List<Country> countriesOfSale) {
        this.countriesOfSale = countriesOfSale;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Factory extends Country {
    List<Car> cars;

    public Factory() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }


    public void getGear(Car car) {

        if (car.isAutomaticGear) {
            System.out.println("automat");
        } else {
            System.out.println("manual");
        }

    }

    public void printAllData() {
        for (Car allCars : cars) {

            System.out.println("\n" + allCars.getName() + " " + allCars.getModel() + " " + ", Skrzynia automatyczna: " + allCars.isAutomaticGear() + ", Segment: " + allCars.getSegment() + " ,Wymiary: " +
                    " Wysokość " + allCars.getHigh() + "cm" + ", Szerokość: " + allCars.getWidth() + "cm" + ", Pojemność baku: " + allCars.getTankCapacity() + " litrów" + ", Kraje sprzedaży: ");

            for (Country allCountries : allCars.getCountriesOfSale()) {
                System.out.println(allCountries.getCountryName() + " - " + allCountries.countrySign + " ");
            }
        }
    }

    public void printCountryNameFor(String producerName, boolean isAutomaticGear, int tankCapacity) {
        System.out.println("\nNazwa producenta: " + producerName + " \nCzy skrzynia jest automatyczna: " + isAutomaticGear + "\nPojemność baku: " + tankCapacity);

        for (Car allCars : cars) {

            if (Objects.equals(allCars.getName(), producerName) && allCars.isAutomaticGear() == isAutomaticGear && allCars.getTankCapacity() == tankCapacity) {
                for (Country allCountries : allCars.getCountriesOfSale()) {
                    System.out.println(allCountries.getCountryName() + " - " + allCountries.countrySign + " ");
                }
            }
        }

    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country japan = new Country("Japan", 'J');
        Country romania = new Country("Romania", 'R');
        Country america = new Country("Usa", 'U');
        Country china = new Country("China", 'C');
        Country netherlands = new Country("Netherlands", 'N');
        Country belgium = new Country("Belgium", 'B');
        Country finland = new Country("Finland", 'F');
        Country india = new Country("India", 'I');
        Country latvia = new Country("Latvia", 'L');
        Country pakistan = new Country("Pakistan", 'P');
        Country thailand = new Country("Thailand", 'T');
        Country albania = new Country("Albania", 'A');
        Country monaco = new Country("Monaco", 'M');

        List<Country> bmwCountriesOfSale = new ArrayList<>(Arrays.asList(poland, germany, pakistan, thailand, albania));
        List<Country> toyotaCountriesOfSale = new ArrayList<>(Arrays.asList(germany, poland, monaco, india, america));
        List<Country> hondaCountriesOfSale = new ArrayList<>(Arrays.asList(poland, germany, romania, thailand, belgium));
        List<Country> ferrariCountriesOfSale = new ArrayList<>(Arrays.asList(poland, germany, pakistan, japan, albania));
        List<Country> mercedesCountriesOfSale = new ArrayList<>(Arrays.asList(poland, germany, america, monaco, latvia));
        List<Country> porscheCountriesOfSale = new ArrayList<>(Arrays.asList(poland, germany, finland, thailand, albania));
        List<Country> volvoCountriesOfSale = new ArrayList<>(Arrays.asList(poland, germany, japan, thailand, albania));
        List<Country> fordCountriesOfSale = new ArrayList<>(Arrays.asList(albania, germany, america, thailand, poland));
        List<Country> daciaCountriesOfSale = new ArrayList<>(Arrays.asList(albania, germany, china, romania, netherlands));
        List<Country> bmwM3CountriesOfSale = new ArrayList<>(Arrays.asList(poland, germany, poland, thailand, poland));



        Car carBmwX5 = new Car("Bmw", "X5", 2, 3, 40, true, "premium",bmwCountriesOfSale);
        Car carToyotaCorolla = new Car("Toyota", "Corolla", 2, 4, 45, false, "medium",toyotaCountriesOfSale);
        Car carHondaCivic = new Car("Honda", "Civic", 3, 4, 56, true, "medium",hondaCountriesOfSale);
        Car carFerrariItalia458 = new Car("Ferrari", "Italia458", 4, 7, 78, true, "premium",ferrariCountriesOfSale);
        Car carMercedesW124 = new Car("Mercedes", "W124", 5, 3, 65, true, "premium",mercedesCountriesOfSale);
        Car carPorsche911 = new Car("Porsche", "911", 4, 5, 56, true, "premium",porscheCountriesOfSale);
        Car carBmwM3 = new Car("Bmw", "M3", 2, 3, 40, true, "premium",bmwM3CountriesOfSale);
        Car carVolvoS60 = new Car("Volvo", "S60", 3, 6, 47, false, "premium",volvoCountriesOfSale);
        Car carFordMustang = new Car("Ford", "Mustang", 3, 2, 37, true, "premium",fordCountriesOfSale);
        Car carDaciaDuster = new Car("Dacia", "Duster", 2, 5, 54, false, "standard",daciaCountriesOfSale);
//


        Factory factory = new Factory();
        factory.addCar(carBmwX5);
        factory.addCar(carToyotaCorolla);
        factory.addCar(carHondaCivic);
        factory.addCar(carFerrariItalia458);
        factory.addCar(carMercedesW124);
        factory.addCar(carPorsche911);
        factory.addCar(carVolvoS60);
        factory.addCar(carFordMustang);
        factory.addCar(carDaciaDuster);
        factory.addCar(carBmwM3);

        factory.printAllData();
        factory.printCountryNameFor("Bmw",true,40);
    }

}
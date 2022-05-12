public class Country {
    String countryName;
    char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public Country() {

    }

    public String getCountryName() {
        return countryName;
    }


    public char getCountrySign() {
        return countrySign;
    }

}

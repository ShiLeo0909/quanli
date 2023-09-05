package oop8.EX4_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length; i++) {
            int min = i;
            for (int j = i + 1; j < newArray.length - 1; j++) {
                if (newArray[i].getPopulation() < newArray[j].getPopulation()) {
                    min = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[min];
            newArray[min] = temp;

        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getPopulation() > newArray[j].getPopulation()) {
                    max = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[max];
            newArray[max] = temp;

        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[i].getGdp() > newArray[j].getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[i].getGdp() < newArray[j].getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        /* TODO */

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        ArrayList<Country> list = new ArrayList<>();
        for (Country country : countries) {
            if(country instanceof AfricaCountry){
                list.add(country);
            }
        }
        AfricaCountry[] arr = new AfricaCountry[list.size()];
        return list.toArray(arr);
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        ArrayList<Country> list = new ArrayList<>();
        for (Country country : countries) {
            if(country instanceof AsiaCountry){
                list.add(country);
            }
        }
        AsiaCountry[] arr = new AsiaCountry[list.size()];
        return list.toArray(arr);
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        ArrayList<Country> list = new ArrayList<>();
        for (Country country : countries) {
            if(country instanceof EuropeCountry){
                list.add(country);
            }
        }
        EuropeCountry[] arr = new EuropeCountry[list.size()];
        return list.toArray(arr);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        ArrayList<Country> list = new ArrayList<>();
        for (Country country : countries) {
            if(country instanceof NorthAmericaCountry){
                list.add(country);
            }
        }
        NorthAmericaCountry[] arr = new NorthAmericaCountry[list.size()];
        return list.toArray(arr);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        ArrayList<Country> list = new ArrayList<>();
        for (Country country : countries) {
            if(country instanceof OceaniaCountry){
                list.add(country);
            }
        }
        OceaniaCountry[] arr = new OceaniaCountry[list.size()];
        return list.toArray(arr);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        ArrayList<Country> list = new ArrayList<>();
        for (Country country : countries) {
            if(country instanceof SouthAmericaCountry){
                list.add(country);
            }
        }
        SouthAmericaCountry[] arr = new SouthAmericaCountry[list.size()];
        return list.toArray(arr);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country [] newArr = new Country[howMany];
        Country[] src = sortByIncreasingPopulation();
        System.arraycopy(src,0,newArr,0,howMany);
        return newArr;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country [] newArr = new Country[howMany];
        Country[] src = sortByDecreasingPopulation();
        System.arraycopy(src,0,newArr,0,howMany);
        return newArr;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country [] newArr = new Country[howMany];
        Country[] src = sortByIncreasingArea();
        System.arraycopy(src,0,newArr,0,howMany);
        return newArr;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country [] newArr = new Country[howMany];
        Country[] src = sortByDecreasingArea();
        System.arraycopy(src,0,newArr,0,howMany);
        return newArr;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country [] newArr = new Country[howMany];
        Country[] src = sortByIncreasingGdp();
        System.arraycopy(src,0,newArr,0,howMany);
        return newArr;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country [] newArr = new Country[howMany];
        Country[] src = sortByDecreasingGdp();
        System.arraycopy(src,0,newArr,0,howMany);
        return newArr;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}


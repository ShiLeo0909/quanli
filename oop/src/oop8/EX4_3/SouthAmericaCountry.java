package oop8.EX4_3;

public class SouthAmericaCountry extends Country{

    private int population;
    private double area;
    private double gdp;

    public SouthAmericaCountry(String code, String name, int population, double area, double gdp) {
        super(code, name);
        this.population = population;
//        this.area = area;
        this.gdp = gdp;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getGdp() {
        return gdp;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}

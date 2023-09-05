package oop11.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();


        CarBuilder builder = new CarBuilder();
        director.makeSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("\n Car buider \n" + car.toString());


        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSUV(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\n Car manual SUV built \n" + manual.toString());
    }
}

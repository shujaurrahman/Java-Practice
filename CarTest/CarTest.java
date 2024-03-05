package CarTest;

public class CarTest {
    public static void main(String[] args) {
        // Create three SportsCar objects
        SportsCar car1 = new SportsCar();
        SportsCar car2 = new SportsCar();
        SportsCar car3 = new SportsCar();

        // Set data for each car
        car1.setCompany("Ferrari");
        car1.setModel("488 GTB");
        car1.setYear(2022);
        car1.setColor("Red");
        car1.setTopSpeed(205);

        car2.setCompany("Lamborghini");
        car2.setModel("Huracan");
        car2.setYear(2023);
        car2.setColor("Yellow");
        car2.setTopSpeed(210);

        car3.setCompany("Porsche");
        car3.setModel("911 Turbo");
        car3.setYear(2021);
        car3.setColor("Blue");
        car3.setTopSpeed(198);

        // Find the car with the maximum speed
        SportsCar fastestCar = findFastestCar(car1, car2, car3);

        // Display the result
        System.out.println("The fastest car is a " + fastestCar.getCompany() + " " +
                fastestCar.getModel() + " with a top speed of " + fastestCar.getTopSpeed() + " km/h.");
    }

    // Function to find the car with the maximum speed
    public static SportsCar findFastestCar(SportsCar... cars) {
        SportsCar fastestCar = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getTopSpeed() > fastestCar.getTopSpeed()) {
                fastestCar = cars[i];
            }
        }
        return fastestCar;
    }
}

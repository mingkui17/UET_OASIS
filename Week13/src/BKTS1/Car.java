public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * chuyen.
     *
     */

    public Car(String brand, String model,
               String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Car:"
               + "\n\tBrand: " + brand
               + "\n\tModel: " + model
               + "\n\tRegistration Number: " + registrationNumber
               + "\n\tNumber of Doors: " + numberOfDoors
               + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

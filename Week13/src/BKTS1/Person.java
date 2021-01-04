import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * chuyen.
     *
     */
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * chuyen.
     *
     */

    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (registrationNumber.equals(vehicleList.get(i).getRegistrationNumber())) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    /**
     * chuyen.
     *
     */

    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            String info = name + " has:\n\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                info += vehicleList.get(i).getInfo() + "\n";
            }
            return info;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

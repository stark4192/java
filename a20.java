import java.util.*;

interface Vehicle {
    public abstract String getVehicleName();

    public abstract int getCapacity();

    public abstract int getMilage();

    public abstract int getSpeed();
}

abstract class TwoWheeler implements Vehicle {
    public abstract void displayVehicleDetails();
}
 
abstract class ThreeWheeler implements Vehicle {
    public abstract void displayVehicleDetails();
}

abstract class FourWheeler implements Vehicle {
    public abstract void displayVehicleDetails();
}

class Scooter extends TwoWheeler {
    String vehicleName;
    int capacity;
    int milage;
    int speed;

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Milage: " + milage);
        System.out.println("Speed: " + speed);
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMilage() {
        return milage;
    }

    public int getSpeed() {
        return speed;
    }
}

class AutoRickshaw extends ThreeWheeler {
    String vehicleName;
    int capacity;
    int milage;
    int speed;

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Milage: " + milage);
        System.out.println("Speed: " + speed);
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMilage() {
        return milage;
    }

    public int getSpeed() {
        return speed;
    }
}

class Truck extends FourWheeler {
    String vehicleName;
    int capacity;
    int milage;
    int speed;

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Milage: " + milage);
        System.out.println("Speed: " + speed);
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMilage() {
        return milage;
    }

    public int getSpeed() {
        return speed;
    }
}

class a20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scooter
        System.out.println("Enter the details of Scooter");
        Scooter scooter = new Scooter();
        scooter.vehicleName = sc.nextLine();
        scooter.capacity = sc.nextInt();
        scooter.milage = sc.nextInt();
        scooter.speed = sc.nextInt();
        scooter.displayVehicleDetails();

        // AutoRickshaw
        System.out.println("Enter the details of AutoRickshaw");
        sc.next();
        AutoRickshaw autoRickshaw = new AutoRickshaw();
        autoRickshaw.vehicleName = sc.nextLine();
        autoRickshaw.capacity = sc.nextInt();
        autoRickshaw.milage = sc.nextInt();
        autoRickshaw.speed = sc.nextInt();
        autoRickshaw.displayVehicleDetails();

        // Truck
        System.out.println("Enter the details of Truck");
        Truck truck = new Truck();
        sc.next();
        truck.vehicleName = sc.nextLine();
        truck.capacity = sc.nextInt();
        truck.milage = sc.nextInt();
        truck.speed = sc.nextInt();
        truck.displayVehicleDetails();
    }
}

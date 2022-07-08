package lld.basics.SOLID.LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public interface Vehicle {
    void startEngine();
}

class Car implements Vehicle{
    @Override
    public void startEngine() {

    }
}

class Bicycle implements Vehicle{

    // thos is not correct implementation as derived class is not substituted for base class
    @Override
    public void startEngine() {
//        throw new EngineNotFoundException();
    }
}


class VehicleMonitor{
    public void startVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle car = new Car();
        Vehicle cycle = new Bicycle();
        vehicles.add(car);
        vehicles.add(cycle);

        // here it will throw engine not found exception
        vehicles.forEach(vehicle -> vehicle.startEngine());
    }
}

// so we should seggregate our classes
// vehicle -> VehicleWithEngineClass, VehicleWithoutEngineClass
//                Car                     Bicycle




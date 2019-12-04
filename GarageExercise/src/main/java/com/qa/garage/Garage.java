package com.qa.garage;

import java.util.*;

public class Garage {

    private ArrayList<Vehicle> myCollection = new ArrayList<Vehicle>();

    public void addVehicle(Vehicle vehicle) {

        myCollection.add(vehicle);
    }

    // public void addVehicle(Motorbike bike) {

    //     myCollection.add(bike);
    // }

    // public void addVehicle(Truck truck) {

    //     myCollection.add(truck);
    // }

    public int totalBill() {

        int z = 0;
        
        for (Vehicle v : myCollection) {

            z += v.calcBill();
        }
        
        return z;
    }
    
    public void emptyCollection() {

        myCollection.clear();
    }
    
    public Vehicle getVehicle(int index) {

        return myCollection.get(index);
    }

    public int getSize() {
        return myCollection.size();
    } 
    
    //Same method for iterating over data in database
    public void removeByType(Class<?> vehicleType) {

        Iterator<Vehicle> itr = myCollection.iterator();

        while (itr.hasNext()) {

            Vehicle v = itr.next();
            
            if (v.getClass() == vehicleType) {
                itr.remove();
            }
        }
    }
}


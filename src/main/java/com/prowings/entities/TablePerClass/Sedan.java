package com.prowings.entities.TablePerClass;


import jakarta.persistence.Entity;

@Entity
public class Sedan extends Car {
    private double trunkCapacity;

    
    public Sedan() {
    }

    public Sedan(String make, String model, double price, double trunkCapacity) {
        super(make, model, price);
        this.trunkCapacity = trunkCapacity;
    }

	public double getTrunkCapacity() {
		return trunkCapacity;
	}

	public void setTrunkCapacity(double trunkCapacity) {
		this.trunkCapacity = trunkCapacity;
	}

	@Override
	public String toString() {
		return "Sedan [trunkCapacity=" + trunkCapacity + "]";
	}
     
}


package com.prowings.entities.TablePerClass;



import jakarta.persistence.Entity;

@Entity
public class SUV extends Car {
    private boolean fourWheelDrive;

    
    public SUV() {
    }

    public SUV(String make, String model, double price, boolean fourWheelDrive) {
        super(make, model, price);
        this.fourWheelDrive = fourWheelDrive;
    }

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	@Override
	public String toString() {
		return "SUV [fourWheelDrive=" + fourWheelDrive + "]";
	}

    
}

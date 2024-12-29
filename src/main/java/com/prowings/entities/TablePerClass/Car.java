package com.prowings.entities.TablePerClass;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String make;
    private String model;
    private double price;

   
    public Car() {
    }

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", price=" + price + "]";
	}

    
}

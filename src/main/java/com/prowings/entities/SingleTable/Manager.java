package com.prowings.entities.SingleTable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MNGR")

public class Manager extends Employee1 {

	@Column
	
	private String managerialWorkStatus;

	public Manager() {
	}

	public Manager(int age, String name, int salary, String department, String managerialWorkStatus) {
		super(age, name, salary, department);
		this.managerialWorkStatus = managerialWorkStatus;
	}

	public Manager(String managerialWorkStatus) {
		super();
		this.managerialWorkStatus = managerialWorkStatus;
	}

	public String getManagerialWorkStatus() {
		return managerialWorkStatus;
	}

	public void setManagerialWorkStatus(String managerialWorksStatus) {
		this.managerialWorkStatus = managerialWorksStatus;
	}

	@Override
	public String toString() {
		return "Manager [managerialWorkStatus=" + managerialWorkStatus + "]";
	}

}

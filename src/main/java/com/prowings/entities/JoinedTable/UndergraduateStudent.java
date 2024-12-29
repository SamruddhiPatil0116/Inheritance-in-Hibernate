package com.prowings.entities.JoinedTable;



import jakarta.persistence.Entity;

@Entity
public class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent() {}


	

	public UndergraduateStudent(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "UndergraduateStudent [major=" + major + "]";
	}

   
}

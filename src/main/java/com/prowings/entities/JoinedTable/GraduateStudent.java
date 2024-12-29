package com.prowings.entities.JoinedTable;


import jakarta.persistence.Entity;

@Entity
public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent() {}

    public GraduateStudent(String name, int age, String thesisTitle) {
        super(name, age);
        this.thesisTitle = thesisTitle;
    }

	public String getThesisTitle() {
		return thesisTitle;
	}

	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}

	@Override
	public String toString() {
		return "GraduateStudent [thesisTitle=" + thesisTitle + "]";
	}

   
}


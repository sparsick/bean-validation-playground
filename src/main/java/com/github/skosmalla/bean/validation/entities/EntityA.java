package com.github.skosmalla.bean.validation.entities;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class EntityA {

	@NotNull
	private String propertyA;

	@NotBlank
	private String propertyB;

	public String getPropertyA() {
		return this.propertyA;
	}

	public void setPropertyA(String propertyA) {
		this.propertyA = propertyA;
	}

	public String getPropertyB() {
		return this.propertyB;
	}

	public void setPropertyB(String propertyB) {
		this.propertyB = propertyB;
	}

}

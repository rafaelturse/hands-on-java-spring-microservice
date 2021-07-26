package com.turse.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private Double daylyIncome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDaylyIncome() {
		return daylyIncome;
	}

	public void setDaylyIncome(Double daylyIncome) {
		this.daylyIncome = daylyIncome;
	}
}